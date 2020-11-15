package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {
    @Test
    public void  uploading() {

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
String path="C:\\Users\\Admin\\Desktop";

WebElement uploadInput=Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.wait(2);
uploadInput.sendKeys(path);
WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
uploadButton.click();





    }
}