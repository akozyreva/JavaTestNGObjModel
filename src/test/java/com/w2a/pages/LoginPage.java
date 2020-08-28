package com.w2a.pages;

import com.w2a.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Page {


    public ZohoAppPage doLogin(String username, String pwd) {
        driver.findElement(By.xpath("//input[@id='login_id']")).
                sendKeys(username);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement nxtLoginBtn = wait.until(ExpectedConditions.
                elementToBeClickable(By.xpath("//form[@id='login']//button[@id='nextbtn']")));
        nxtLoginBtn.click();
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys(pwd);
        driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
        return new ZohoAppPage();
    }
}
