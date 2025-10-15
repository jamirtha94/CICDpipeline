package com.qa.mystepdefs;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

    @Given("the user is on cart")
    public void login() {
        WebDriver driver = null;
        driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }

    public static void main(String[] args) {
    }
}
