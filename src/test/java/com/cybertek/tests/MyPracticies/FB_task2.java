package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_task2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

driver.findElement(By.name("email")).sendKeys("2324");
driver.findElement(By.name("pass")).sendKeys("12234"+ Keys.ENTER);

String expectedResult="Log into Facebook | Facebook";
String actualResult=driver.getTitle();

if(actualResult.equals(expectedResult)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}

    }
}
