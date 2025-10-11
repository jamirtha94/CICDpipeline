package com.qa.mystepdefs;
import io.cucumber.java.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;


import static org.junit.Assert.assertTrue;

public class LoginStepDefinition{
    private LoginPage loginPage;
    private WebDriver driver =null;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @After
    public void tearDown(){
        if(driver!= null){
            driver.quit();
        }
    }

    @Given ("the user is on the login page")
    public void login_page(){
        System.out.println("login");
        driver.navigate().to("https://www.saucedemo.com/v1/");
        loginPage = new LoginPage(driver);

    }
    @When ("the user enters valid credentials")

    public void credentials(){
        loginPage.enterEmail("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        System.out.println("credentials");
    }

    @Then ("the user should be redirected to the dashboard")
    public void dashboard(){
        System.out.println("credentials");
    }

    @When("the user enters invalid {string} and {string}")
    public void invalid_cred(String username, String password) {
        loginPage.login(username, password);
        String actual = driver.getTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(expectedTitle, actual);
        System.out.println("Assertion Passed");
        System.out.println("invalid credentials");
    }

    @Then ("an {string} message should be displayed")
    public void error(String error){
        WebElement actual_error = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
        String actualerror = actual_error.getText();
        System.out.println("error message is:"+ actualerror);
    }

}


