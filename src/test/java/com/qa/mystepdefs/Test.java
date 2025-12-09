package com.qa.mystepdefs;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Set;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        Actions action = new Actions(driver);
        WebElement mouse = driver.findElement(By.xpath("//a[contains(text(),'Click')]"));
        action.moveToElement(mouse).click().perform();
        String parent =driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();
        for(String window: allwindow){
            if(!window.equals(parent)){
               driver.switchTo().window(window);

            }
        }
        String expected = "New Window";
        String actual= driver.getTitle();
        Assert.assertEquals(expected,actual);
        }
    }
