package com.auto.page.browser;

import com.auto.model.UserModel;

import java.util.Arrays;

public class BasePage {

    private final UserModel usermodel = new UserModel();

    public void sleep_time(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void we_capture_value(String value) {
        String[] arrayValue = value.split("=", 2);
        arrayValue = Arrays.stream(arrayValue).map(String::trim).toArray(String[]::new);
        String typeValue = arrayValue[0];
        String dataValue = arrayValue[1];
        if ((typeValue.toLowerCase()).equals("username")){
            usermodel.setUsername(dataValue);
        }
    }

}
