package com.telran.wikipedia;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver driver;

    @Test
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("https://en.wikipedia.org");

        Thread.sleep(30000);
        driver.quit();
    }
}