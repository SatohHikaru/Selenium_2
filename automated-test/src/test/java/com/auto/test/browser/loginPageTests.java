package com.auto.test.browser;

import com.auto.page.browser.loginPage;
import com.auto.page.browser.TADashboardMainPage;
import org.testng.annotations.Test;

public class loginPageTests extends testBase {

    com.auto.page.browser.loginPage loginPage = new loginPage();
    TADashboardMainPage dashboardPage = new TADashboardMainPage();

    @Test(description = "Verify that user can login specific repository successfully via Dashboard login page with correct credentials")
    public void DA_LOGIN_TC001() {
        loginPage.Login("administrator", "");
        dashboardPage.isMainPageDisplayed();
        dashboardPage.logOut();
    }

}
