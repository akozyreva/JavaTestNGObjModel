package com.w2a.base;

import com.w2a.pages.crm.accounts.AccountsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
    /*

    TopMenu is not page, it's a widget
    HomePage has TopMenu
    AccountsPage has TopMenu

     */
    WebDriver driver;

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome() {

    }

    public AccountsPage goToAccounts() {
        driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
        return new AccountsPage();
    }

    public void signOut() {

    }
}
