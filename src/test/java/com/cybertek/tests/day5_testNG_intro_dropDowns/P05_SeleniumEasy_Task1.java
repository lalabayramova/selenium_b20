package com.cybertek.tests.day5_testNG_intro_dropDowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {
    public static void main(String[] args){


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

WebElement successCheckBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
WebElement successMessage=driver.findElement(By.xpath("//div[@id='txtAge']"));

if(!successMessage.isDisplayed()){
    System.out.println("Success message is not displayed. Verification passed!");
}else {
    System.out.println("Success message is displayed. Verificaton failed!");
}
successCheckBox.click();

        if(successMessage.isDisplayed()){
            System.out.println("Success message is  displayed. Verification passed!");
        }else {
            System.out.println("Success message is not displayed. Verification failed!");
        }

driver.close();


    }
}
