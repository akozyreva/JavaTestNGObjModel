package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class AccountsPage extends Page {
    public CreateAccountPage goToCreateAccounts() {
        driver.findElement(By.xpath("//span[@id='createIcon']")).click();
        driver.findElement(By.xpath("//a[@id='submenu_Accounts']")).click();
        return new CreateAccountPage();

    }

    public void goToImportAccounts() {

    }
}
