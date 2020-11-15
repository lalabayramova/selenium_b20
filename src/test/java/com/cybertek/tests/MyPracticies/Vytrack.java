package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Vytrack {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/");
driver.manage().window().maximize();
driver.findElement(By.name("_username")).sendKeys("storemanager216");
driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);
Thread.sleep(3000);

driver.findElement(By.linkText("Fleet")).click();
Thread.sleep(2000);

driver.findElement(By.linkText("Vehicle Odometer")).click();



    }
}
