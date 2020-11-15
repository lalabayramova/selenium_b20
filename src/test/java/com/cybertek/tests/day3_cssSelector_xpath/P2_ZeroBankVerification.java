package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {


/*
3. Verify link text from top left:
//        Expected: “Zero Bank”
//        4. Verify link href attribute value contains:
//        Expected: “index.html”

*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
WebElement bankName=driver.findElement(By.className("brand"));
String actualTextName=bankName.getText();
String expectedTextName="Zero Bank";
if(actualTextName.equals(expectedTextName)){
    System.out.println("Name verification passed");
}else {
    System.out.println("Name verification failed");
}
String expectedHref="index.html";
String actualHref=bankName.getAttribute("href");
if(actualHref.contains(expectedHref)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}




    }
}
