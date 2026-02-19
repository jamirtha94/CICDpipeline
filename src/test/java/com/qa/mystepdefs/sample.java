package com.qa.mystepdefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class sample {
    private WebDriver driver = null;
    private LoginPage loginPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("the user clicks on Alert")
    public void alert() {

        // Open Google
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        String alert_text = alert.getText();
        System.out.println(alert_text);
        alert.dismiss();
        // Print title
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Given("The user is on login page")
    public void login() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String parent = driver.getWindowHandle();
        driver.findElement(By.cssSelector("a[href*='elemental']")).click();
        Set<String> all_window = driver.getWindowHandles();
        for (String window : all_window) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Take me to the tips! ')]")).click();
        driver.close();
        driver.switchTo().window(parent);
        driver.quit();

    }

    @Given("the user clicks on drop down")
    public void dropdown() {
        loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/");
        loginPage.enterEmail("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class*='product']")));
        WebElement dropdown = driver.findElement(By.cssSelector("select[class*='product']"));
        retry(driver, By.cssSelector("select[class*='product']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (high to low)");

    }

    public void retry(WebDriver driver, By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                driver.findElement(locator).click();
                break;
            } catch (StaleElementReferenceException e) {

                attempts++;
            }
        }

    }

    @Given("user is on Amazon homepage")
    public void homepage() {
        driver.get("https://www.amazon.com");
    }

    @When("user searches for laptop")
    public void search() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        searchbox.sendKeys("laptop");
        WebElement searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button")));
        searchbar.click();

    }

    @Then("search results should be displayed")
    public void display() {

    }

    @Given("the user is on the {string}")
    public void linkcount(String url) {
        driver.get(url);
        List<WebElement> l1 = driver.findElements(By.tagName("a"));
        int size =0;
        for(WebElement li: l1){
            if(li.isDisplayed()){
                size++;
                System.out.println(li.getAttribute("href"));
                System.out.println(li.getText());
            }
        }




    }


    public static void main(String[] args) {

    }
}