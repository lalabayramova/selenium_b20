package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com");
driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
String actualResult=driver.getTitle();
 String expected = "Wooden spoon | Etsy";

if(actualResult.equals(expected)){
    System.out.println("True");
}else{
    System.out.println("False");
}

    }
}
