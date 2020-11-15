package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling_Practices {
    /*

    1.Create	a	new	class	called:	WindowHandlePractice
    2.Create	new	test	and	make	set	ups
    3.Go	to	:	http://practice.cybertekschool.com/windows
    4.Assert:	Title	is	“Practice”
    5.Click	to:	“Click	Here”text
    6.Switch	to	new	Window.
    7.Assert:	Title	is	“New	Window
    */
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }
    @Test
    public void windowHandling(){
        String  actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.equals("Practice"));
WebElement clickButton=driver.findElement(By.linkText("Click Here"));
clickButton.click();
String titleAfterClick=driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        String mainWindowHandle=driver.getWindowHandle();
        System.out.println("mainWindowHandle = " + mainWindowHandle);

Set<String> windowHandles= driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title: "+driver.getTitle());
            Assert.assertTrue(driver.getTitle().equals("New Window"));
            
        }
            
        }
        
    }





