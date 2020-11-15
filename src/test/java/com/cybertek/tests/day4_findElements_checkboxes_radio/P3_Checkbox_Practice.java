package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Practice {
    public static void main(String[] args) {

/*
Practice:CybertekCheckboxes
1.Go	to	http://practice.cybertekschool.com/checkboxes
2.Confirm	checkbox	#1	is	NOT	selected	by	default
3.Confirm	checkbox	#2	is	SELECTED	by	default.
4.Click	checkbox	#1	to	select	it.
5.Click	checkbox	#2	to	deselect	it.
6.Confirm	checkbox	#1	is	SELECTED.
7.Confirm	checkbox	#2	is	NOT
*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

WebElement button1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
WebElement button2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

if(!button1.isSelected()){
    System.out.println("Verification Passed");
}else {
    System.out.println("Verification failed");
}
if(button2.isSelected()){
    System.out.println("Verification Passed");
}else{
    System.out.println("Verification Failed");
}

button1.click();
button2.click();
if(button1.isSelected()){
    System.out.println("Verification passed");
}else {
    System.out.println("verification failed");
}
if(!button2.isSelected()){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}







    }
}
