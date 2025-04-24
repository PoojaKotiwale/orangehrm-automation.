package com.qa.tests;

import com.qa.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        Thread.sleep(2000);
        System.out.println("Login successful");
    }
}