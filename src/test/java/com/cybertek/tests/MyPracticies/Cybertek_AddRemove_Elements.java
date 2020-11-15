package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cybertek_AddRemove_Elements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

WebElement element=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
element.click();

WebElement delete=driver.findElement(By.xpath("//button[@class='added-manually']"));

try{
    delete.click();
    if(delete.isDisplayed()){
        System.out.println("Verification passed!");
    }else {
        System.out.println("Verification failed!");
    }

}catch(StaleElementReferenceException ex){
    System.out.println(ex);
}


    }


}
