package com.auto.page.browser;

import com.logigear.element.Element;

public class TADashboardMainPage {

    private final Element mainMenu = new Element("//div[@id='main-menu']");
    private final Element active_execution_dashboard = new Element("//div[@id='main-menu']//li[@class='active']/a[@class='active']");


    public Boolean isMainPageDisplayed() {

        return mainMenu.isDisplayed();
    }

    public void logOut() {
        Element accountButton = new Element("//a[@href='#Welcome']");
        Element logoutButton = new Element("//a[@href='logout.do']");
        accountButton.click();
        logoutButton.click();
    }

}
