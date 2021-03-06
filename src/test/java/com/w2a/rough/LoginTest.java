package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
    public static void main(String[] args) {

        HomePage home = new HomePage();
        LoginPage login = home.goToLogin();
        ZohoAppPage zp = login.doLogin("lemole8326@qqmimpi.com", "Selenium@123");
        CRMHomePage crm = zp.goToCRM();
        crm.verifyCRMHomePage();
        AccountsPage account = Page.menu.goToAccounts();
        CreateAccountPage cap =  account.goToCreateAccounts();
        cap.createAccount("test");

    }
}
