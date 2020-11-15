package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void windowPractice() {
        String actualResult = driver.getTitle();
        String expectedResult = "Practice";
        Assert.assertEquals(actualResult, expectedResult);

        WebElement clickButton = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickButton.click();
        String titleAfterClick = driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title= " + driver.getTitle());
            System.out.println("Current WINDOW HANDLE= " + driver.getWindowHandle());
        }
        Assert.assertTrue(driver.getTitle().equals("New Window"));

        driver.close();

        driver.switchTo().window(mainHandle);


    }


    @Test
    public void twoWindows() {
driver.get(" https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String>windowHandles=driver.getWindowHandles();

for(String each:windowHandles){
    BrowserUtils.wait(1);
    driver.switchTo().window(each);
    System.out.println("Current page: "+driver.getTitle());

    if(driver.getCurrentUrl().contains("etsy")){
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
        break;
    }
}
    }

}