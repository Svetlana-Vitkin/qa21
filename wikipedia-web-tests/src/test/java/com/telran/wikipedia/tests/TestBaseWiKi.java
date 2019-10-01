package com.telran.wikipedia.tests;

import com.telran.wikipedia.manager.ApplicationMeneger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class TestBaseWiKi {
    protected static ApplicationMeneger app =
            new ApplicationMeneger(System.getProperty("browser", BrowserType.EDGE));

    @BeforeSuite
    public  void setUp(){
        app.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        app.stop();
    }
}
