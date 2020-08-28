package com.w2a.pages.crm;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class CRMHomePage extends Page {

    public void verifyCRMHomePage() {
        String crmWelcomeTxt = driver.findElement(By.xpath("//span[@id='show-uName']")).getText();
        assert crmWelcomeTxt.equals("Welcome lemole8326");
    }
}
