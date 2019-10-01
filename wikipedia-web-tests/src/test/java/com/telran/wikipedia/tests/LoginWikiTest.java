package com.telran.wikipedia.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBaseWiKi {

    @BeforeMethod
    public void preconditions(){
        if(!app.getSession().isElementPresent(By.id("pt-login"))){
            app.getSession().openSite("https://en.wikipedia.org");
        }
    }

    @Test
    public void loginTest() {
        app.getSession().initLogin();
        app.getSession().fillLoginForm("sveta1234.com", "123456abc");
        app.getSession().confirmLogin();
    }

    @AfterMethod
    public void postActions(){
        app.getSession().openSite("https://en.wikipedia.org");
    }
}
