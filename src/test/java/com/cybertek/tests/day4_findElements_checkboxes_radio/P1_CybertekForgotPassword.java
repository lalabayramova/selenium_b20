package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword  {

    public static void main(String[] args)  {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        WebElement header = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button.radius"));

        WebElement linkText = driver.findElement(By.xpath("//a[.='Cybertek School']"));
        WebElement poweredByDiv = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("linkText = " + linkText.getText());

        System.out.println("poweredByDiv = " + poweredByDiv.getText());


        if (homeLink.isDisplayed() && emailLabel.isDisplayed() && header.isDisplayed()
                && emailInput.isDisplayed() && retrievePasswordButton.isDisplayed()
                && poweredByDiv.isDisplayed()){
            System.out.println("ALL WEB ELEMENTS ARE DISPLAYED. VERIFICATION PASSED!");
        }else {
            System.out.println("One or more of the web elements are not displayed. Verification FAILED!!!");
        }









    }
}
