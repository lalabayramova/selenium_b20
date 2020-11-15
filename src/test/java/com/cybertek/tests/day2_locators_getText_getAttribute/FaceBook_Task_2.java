package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Task_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

driver.findElement(By.id("email")).sendKeys("lala@yahoo.com"+ Keys.ENTER);
driver.findElement(By.id("pass")).sendKeys("345454"+Keys.ENTER);
    }
}
