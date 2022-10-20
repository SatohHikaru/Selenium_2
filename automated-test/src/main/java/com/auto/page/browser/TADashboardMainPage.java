package com.auto.page.browser;

import com.logigear.element.Element;

public class TADashboardMainPage extends BasePage {

    private final Element mainMenu = new Element("//div[@id='main-menu']");
    private final Element active_execution_dashboard = new Element("//div[@id='main-menu']//li[@class='active']/a[@class='active']");
    private final Element account_setting = new Element("//a[@href='#Welcome' and contains(text(),'administrator')]");
    private final Element logoutButton = new Element("//a[@href='#Welcome' and contains(text(),'administrator')]/parent::li/ul/li/a[contains(text(),'Logout')]");


    public void isMainPageDisplayed() {
        assert_displayed(mainMenu);
        assert_displayed(active_execution_dashboard);
    }

    public void logOut() {
        account_setting.click();
        logoutButton.click();
    }

}
