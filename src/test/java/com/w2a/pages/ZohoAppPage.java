package com.w2a.pages;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoAppPage extends Page {


    public void goToBooks() {
        driver.findElement(By.xpath("//span[@class='_logo-books _logo-x96 zod-app-logo']")).click();

    }
    public CRMHomePage goToCRM() {

        driver.findElement(By.xpath("//span[@class='_logo-crm _logo-x96 zod-app-logo']")).click();
        return new CRMHomePage();
    }

    public void goToCalendar() {
        driver.findElement(By.xpath("//span[@class='_logo-calendar _logo-x96 zod-app-logo']")).click();
    }
}
