package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.pages.LoginPage;
import org.testng.annotations.Test;

public class PageObjectModelPractice {

    @Test
    public void login_to_smartBear(){

        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys("anyusername");
    }
}
