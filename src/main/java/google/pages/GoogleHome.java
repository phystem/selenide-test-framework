package google.pages;


import com.codeborne.selenide.*;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleHome {

    private SelenideElement searchField = $(byName("q"));

    @Step("Search for text '{0}'")
    public void searchFor(String text) {
        searchField.setValue(text).pressEnter();
    }
}
