package com.auto.page.browser;

import com.logigear.element.Element;
import org.openqa.selenium.WebDriver;
import com.auto.model.UserModel;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePage {

    public static WebDriver driver;
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
        if ((typeValue.toLowerCase()).equals("username")) {
            usermodel.setUsername(dataValue);
        }
    }

    public void we_get_value(String value) {
        if ((value.toLowerCase()).equals("username")) {
            usermodel.getUsername();
        }
    }

    public void assert_Equal(String element, String expectedText, String comparison_type) {
        switch (comparison_type) {
            case "str":
                Assert.assertEquals(element, expectedText);
            case "int":
                Assert.assertEquals(Integer.parseInt(element), Integer.parseInt(expectedText));
//            case "list":
//               List<String> eleList = new ArrayList<String>(Arrays.asList(element.split(",")));
//                List<String> textList = new ArrayList<String>(Arrays.asList(expectedText.split(",")));
//                //Assert.assertEquals(eleList,textList);
//                Assert.assertSame(eleList,textList);
            default:
                System.out.println("Please input String or ID only");
                break;
        }
    }

    public void assert_displayed(Element element_display) {
        boolean checkType = false;
        if (element_display.isDisplayed()) {
            checkType = true;
        }
        Assert.assertTrue(checkType, "User is not in Dashboard page");
    }

}
