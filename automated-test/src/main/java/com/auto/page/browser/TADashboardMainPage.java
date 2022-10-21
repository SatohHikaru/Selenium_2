package com.auto.page.browser;

import com.logigear.element.Element;

public class TADashboardMainPage extends BasePage {

    private final Element mainMenu = new Element("//div[@id='main-menu']");
    private final Element activeExecutionDashboard = new Element("//div[@id='main-menu']//li[@class='active']/a[@class='active']");
    private final Element accountSetting = new Element("//a[@href='#Welcome' and contains(text(),'administrator')]");
    private final Element logoutButton = new Element("//a[@href='#Welcome' and contains(text(),'administrator')]/parent::li/ul/li/a[contains(text(),'Logout')]");


    public void isMainPageDisplayed() {
        assertDisplayed(mainMenu, "Main menu of page is not display");
        assertDisplayed(activeExecutionDashboard, "User is not stay at main page");
    }

    public void logOut() {
        accountSetting.click();
        logoutButton.click();
    }

}
