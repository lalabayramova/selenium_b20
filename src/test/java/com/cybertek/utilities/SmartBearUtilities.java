package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {
    public static void loginToSmartBear(WebDriver driver){

        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();









    }


    public  static void verifyOrder(WebDriver driver,String name) {
        // Created a locator that only returns the names of the costumer from all of the rows

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each : namesList) {
            if (each.getText().equals(name)) {
                Assert.assertTrue(each.getText().equals(name));
                return;
            }

        }
        Assert.fail("Name " + name + " does not exist in the list!");


    }

public static  void printNamesAndCities(WebDriver driver){
    List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
    List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));
for(int i=0; i<namesList.size(); i++){
    System.out.println(("Name: "+(i+1)+namesList.get(i).getText() +
            ", City: "+(i+1)+citiesList.get(i).getText()));
}




}













}
