package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBaseWiKi {

    @Test
    public void testLogin() {
        app.driver.get("https://en.wikipedia.org");
        app.click(By.id("pt-login"));

        app.type(By.id("wpName1"), "sveta@123456");

        app.type(By.id("wpPassword1"), "sveta123456");

        app.click(By.id("wpLoginAttempt"));
    }
}
