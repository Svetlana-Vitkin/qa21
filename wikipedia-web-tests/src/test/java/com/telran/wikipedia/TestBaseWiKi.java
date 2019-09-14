package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseWiKi {
    protected static ApplicationMeneger app = new ApplicationMeneger();

    @BeforeMethod
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        app.stop();
    }
}
