package com.auto.page.browser;

import com.logigear.element.Element;

public class LoginPage extends BasePage {

    private final Element username_login_input = new Element("//input[@id='username']");
    private final Element password_login_input = new Element("//input[@id='password']");
    private final Element button_login = new Element("//div[@class='btn-login' and contains(text(),'Login')]");


    public void Login(String username, String password) {
        username_login_input.enter(username);
        password_login_input.enter(password);
//        we_capture_value("username = "+username+"");
        button_login.click();
        sleep_time(50);
    }

}
