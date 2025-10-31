package com.qa.mystepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class w3 {
    WebDriver driver = null;

    @Before
    public void setup() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
    }
    @After
    public void tear(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("the user clicks checkBox")
    public void checkbox(){
        try {
            driver.get("https://www.w3schools.com/html/html_forms.asp");
        } catch (TimeoutException e) {
            System.out.println("Page load took too long, continuing anyway...");
        }
        driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
        driver.findElement(By.xpath("//input[@id='vehicle2']")).click();

    }

}
