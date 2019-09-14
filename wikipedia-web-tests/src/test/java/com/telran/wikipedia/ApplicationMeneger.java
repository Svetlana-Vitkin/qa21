package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationMeneger {
    WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.NANOSECONDS);
    }

    public void clear(By id) { driver.findElement(id).clear(); }

    public void click(By locator) { driver.findElement(locator).click(); }

    public void stop() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        clear(locator);
        driver.findElement(locator).sendKeys(text);
    }

  //  public void click(By locator) {
 //       click(locator);
 //   }
}
