package com.telran.wikipedia.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationMeneger<session> {
    WebDriver driver;
    ArticleHelper article;
    SessionHelper session;
    String browser;

    public ApplicationMeneger(String browser) {
        this.browser = browser;
    }

    public void init() {
      /*  if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        } else if(browser.equals(BrowserType.EDGE)){
            driver = new EdgeDriver();
        }*/
       driver = new ChromeDriver();
        session = new SessionHelper(driver);
        driver.get("https://en.wikipedia.org");
        article = new ArticleHelper(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        session.openSite("https://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public ArticleHelper getArticle() { return article;}

    public SessionHelper getSession() {
        return session;
    }
}
