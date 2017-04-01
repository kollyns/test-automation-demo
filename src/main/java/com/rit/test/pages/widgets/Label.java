package com.rit.test.pages.widgets;

import com.rit.test.pages.UiComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Label extends UiComponent {

    public Label(final WebDriver driver, final By locator) {
        super(driver, locator);
    }

    public String text() {
        return find().getText();
    }
}
