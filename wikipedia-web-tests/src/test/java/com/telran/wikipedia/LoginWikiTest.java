package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBaseWiKi {

    @Test
    public void setUp() throws InterruptedException {
        driver.get("https://en.wikipedia.org");
        click(By.id("pt-login"));
        click(By.id("wpName1"));
        clear(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).sendKeys("sveta@sveta");
        click(By.id("wpPassword1"));
        clear(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).sendKeys("123456789");
        click(By.id("wpLoginAttempt"));
    }

    public void clear(By locator) { driver.findElement(locator).clear(); }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
