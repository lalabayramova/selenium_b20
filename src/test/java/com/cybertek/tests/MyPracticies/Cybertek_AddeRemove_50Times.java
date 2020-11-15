package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cybertek_AddeRemove_50Times {


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
WebElement addButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
for(int i=0; i<50;i++){
    addButton.click();
}
        List<WebElement>deleteButtons=driver.findElements(By.xpath("//button[.='Delete']"));
        System.out.println("Number of delete buttons on the page "+deleteButtons.size());
for(WebElement each:deleteButtons){
    each.click();
}
try {
    for(WebElement each: deleteButtons){
        if(!each.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
    }


}catch (StaleElementReferenceException ex){
    System.out.println(ex);
}


    }
}
