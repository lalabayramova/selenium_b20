package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
//driver.findElement(By.name("email")).sendKeys("lala@domain.com");

WebElement emailInputBox=driver.findElement(By.name("email"));
emailInputBox.sendKeys("lala@domain.com");

//driver.findElement(By.id("form_submit")).click();
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
retrievePasswordButton.click();

String expectedInUrl="email_sent";
String actualInUrl=driver.getCurrentUrl();
if(actualInUrl.contains(expectedInUrl)){
    System.out.println("Url passed");
}else {
    System.out.println("Failed");
}
WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));
String actualTest=confirmationMessage.getText();
String expectedTest="Your e-mail's been sent!";
if(actualTest.equals(expectedTest)){
    System.out.println("Header text verification passed");
}else {
    System.out.println("Header text verification failed!");
}
if(confirmationMessage.isDisplayed()){
    System.out.println("Confirmation is passed");
}else{
    System.out.println("Confirmation is failed");
}






    }
}
