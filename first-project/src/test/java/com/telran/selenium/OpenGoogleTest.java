package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class OpenGoogleTest extends TestBase{

    @Test
    public void searchJavaTest() throws InterruptedException {

        driver.get("https://www.google.com");
        type(By.name("q"),"java"+Keys.ENTER);
        Thread.sleep(30000);
    }

   // @Test
   // public void clickImFillingLucky(){
   //   new  Actions(driver).moveToElement(driver.findElement(By.name("btnI"))).click().perform();
   // }

}
