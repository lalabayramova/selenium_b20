package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_task3 {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
WebElement fbText=driver.findElement(By.className("_8eso"));
String actualText=fbText.getText();
String expectedResult="Connect with friends and the world around you on Facebook.";

if(actualText.equals(expectedResult)){
    System.out.println("Verification passed");
}else{
    System.out.println("Verification failed");
}



    }
}
