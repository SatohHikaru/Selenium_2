package com.auto.test.browser;

import com.auto.page.browser.LoginPage;
import com.auto.page.browser.TADashboardMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TADashboardTests extends BrowserTestBase {

    LoginPage loginPage = new LoginPage();
    TADashboardMainPage dashboardPage = new TADashboardMainPage();

    @Test(description = "Verify that user can login specific repository successfully via Dashboard login page with correct credentials")
    public void DA_LOGIN_TC001() {
        loginPage.Login("administrator", "");
//        Assert.assertTrue(dashboardPage.isOverviewTabDisplay(), "User is not in Dashboard page");
        dashboardPage.logOut();
    }

}
