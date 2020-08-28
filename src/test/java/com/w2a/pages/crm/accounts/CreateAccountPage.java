package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page {

    public void createAccount (String accountName) {
        driver.findElement(By.
                xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).
                sendKeys(accountName);
    }
}
