package driverfactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import driverfactory.DriverFactory;

public class Hooks {

    @Before(order = 0)
    public void openBrowser() {
        System.out.println("Opening Browser ONE time");
        DriverFactory.getDriver();
    }

    @After(order = 0)
    public void quitBrowser() {
        System.out.println("Closing browser ONE time");
        // DriverFactory.quitDriver();
    }
}
