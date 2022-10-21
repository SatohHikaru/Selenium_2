package com.auto.page.browser;

import com.logigear.element.Element;

public class loginPage extends BasePage {

    private final Element usernameLoginInput = new Element("//input[@id='username']");
    private final Element passwordLoginInput = new Element("//input[@id='password']");
    private final Element buttonLogin = new Element("//div[@class='btn-login' and contains(text(),'Login')]");


    public void enterUsername(String username) {
        usernameLoginInput.enter(username);
    }

    public void enterPassword(String password) {
        passwordLoginInput.enter(password);
    }

    public void Login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        buttonLogin.click();
    }

}