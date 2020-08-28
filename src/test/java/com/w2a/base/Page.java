package com.w2a.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Page {
    public static WebDriver driver;
    public static TopMenu menu;

    public Page() {
        if(driver == null) {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.get("http://www.zoho.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // init top menu for crm home page and accounts page
            menu = new TopMenu(driver);
        }

    }
}
