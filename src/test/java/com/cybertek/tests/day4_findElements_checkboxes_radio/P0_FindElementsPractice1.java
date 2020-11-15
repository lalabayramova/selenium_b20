package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElementsPractice1 {
    public static void main(String[] args) {
/*
TC #0: FINDELEMENTS
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Print out the texts of all links
4.Print out how many total link


 */

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

// shortcut to introduce local variable==> alt+ENTER

        // Locating all the links on the page and storing them into a list of WebElements
         List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
for(WebElement eachLink:listOfLinks){
    System.out.println(eachLink.getText());
}
int numberOfLinks=listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);





    }
}
