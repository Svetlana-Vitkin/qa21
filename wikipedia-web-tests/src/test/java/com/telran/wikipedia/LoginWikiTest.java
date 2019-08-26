package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBaseWiKi {

    @Test
    public void testLogin() {
        driver.get("https://en.wikipedia.org");
        click(By.id("pt-login"));

        click(By.id("wpName1"));
        clear(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).sendKeys("sveta@sveta.com");

        click(By.id("wpPassword1"));
        clear(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).sendKeys("sveta123456");

        click(By.id("wpLoginAttempt"));
    }

    public void clear(By id) { driver.findElement(id).clear(); }

    public void click(By locator) { driver.findElement(locator).click(); }
}
