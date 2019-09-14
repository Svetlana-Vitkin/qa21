package com.telran.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBaseWiKi{

    @Test
    public void testS(){
        app.driver.get("https://en.wikipedia.org");
        app.type(By.name("search"),"java"+ Keys.ENTER);
    }
}