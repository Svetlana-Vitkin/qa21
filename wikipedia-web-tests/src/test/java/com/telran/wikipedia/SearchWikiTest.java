package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBaseWiKi{

    @Test
    public void testS(){
        driver.get("https://en.wikipedia.org");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java"+ Keys.ENTER);
    }
}