package com.telran.wikipedia.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBaseWiKi {

    @Test
    public void searchWikiTestQA() {
        app.getArticle().typeRequest("QA");
        app.getArticle().clickGoButton();
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "QA".toLowerCase());
    }
}