package com.w2a.pages;

import com.w2a.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {


    public LoginPage goToLogin() {

        driver.findElement(By.xpath("//a[@class='zh-login']")).click();
        return new LoginPage();
    }

    public void goToSignUp() {
        driver.findElement(By.xpath("//a[@class='zh-signup']")).click();

    }

    public void goToSupport() {
        driver.findElement(By.xpath("//a[@class='zh-support']")).click();
    }

    public void goToZooEdu() {

    }

    public void validateFooterLinks() {

    }
}
