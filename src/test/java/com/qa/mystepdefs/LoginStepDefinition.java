package com.qa.mystepdefs;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertTrue;

public class LoginStepDefinition{
    WebDriver driver = new ChromeDriver();

    @Given ("the user is on the login page")
    public void login_page(){
        System.out.println("login");
        driver.navigate().to("https://www.saucedemo.com/v1/");
        String title = driver.getTitle();
        String expectedtitle = "Swag1 Labs";
        try{
        
            System.out.println("Assertion Passed");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            System.out.println(driver.getTitle());

        }
     catch (AssertionError ae){
         System.out.println(ae.getMessage());
     }
        finally{
            driver.quit();
        }


    }
    @When ("the user enters valid credentials")

    public void credentials(){
        System.out.println("credentials");
    }

    @Then ("the user should be redirected to the dashboard")
    public void dashboard(){
        System.out.println("credentials");
    }

    @When ("the user enters invalid credentials")
    public void invalid_cred(){
        System.out.println("invalid credentials");
    }

    @Then ("an error message should be displayed")
    public void error(){
        System.out.println("error");
    }

}


