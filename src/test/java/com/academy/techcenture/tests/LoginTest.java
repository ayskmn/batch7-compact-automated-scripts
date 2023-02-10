package com.academy.techcenture.tests;

import com.academy.techcenture.pages.Login;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(priority = 1)
    public void loginTestPositive(){

        extentTest = reports.startTest("Cogmento CRM login positive test");
        Login login = new Login(driver);
        extentTest.log(LogStatus.INFO, "Created login page");
        login.navigateToLoginPage();
        extentTest.log(LogStatus.INFO, "Navigated to Login Page");
        login.login();
        extentTest.log(LogStatus.PASS, "Was able to log in with valid credentials");
    }

    @Test(priority = 2)
    public void loginTestNegative(){
        extentTest = reports.startTest("Cogmento CRM Login negative test");
        Login login = new Login(driver);
        extentTest.log(LogStatus.INFO, "Created login page");
        login.navigateToLoginPage();
        extentTest.log(LogStatus.INFO, "Navigated to Login Page");
        login.loginNegative();
        extentTest.log(LogStatus.PASS, "Was able to log in with invalid credentials");
    }
}
