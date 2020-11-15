package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }
// using verify order method from smartbear class
    @Test
    public void task4_verifyOrder(){
        SmartBearUtilities.verifyOrder(driver,"Mark Smith");

    }

 // using printNamesAndCities method to print all named and cities

@Test
    public void printNamesAndCities(){
        SmartBearUtilities.printNamesAndCities(driver);

}








}
