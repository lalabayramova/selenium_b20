package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {

    LoginPage loginPage;

@Test(description = "Entering incorrect username")
public void negativeLogin() {

    String url=ConfigurationReader.getProperty("smartbearUrl");
    Driver.getDriver().get(url);

    LoginPage loginPage=new LoginPage();
    loginPage.usernameInput.sendKeys("fdfdd"); // incorrect password

    String password=ConfigurationReader.getProperty("smartbear_password");
    loginPage.passwordInput.sendKeys(password);

    loginPage.loginButton.click();

    Assert.assertTrue(loginPage.errorMessage.isDisplayed());
}

@Test(description = "using login method for negative test")
    public void negativeLoginTest(){

    String url=ConfigurationReader.getProperty("smartbearUrl");
    Driver.getDriver().get(url);

loginPage=new LoginPage();

String userName="edvfff";
String password=ConfigurationReader.getProperty("smartbear_password");

loginPage.login(userName,password);

Assert.assertTrue(loginPage.errorMessage.isDisplayed());


    ConfigurationReader.getProperty("smartbear_password");
}



}
