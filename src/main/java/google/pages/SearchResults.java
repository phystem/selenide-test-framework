package google.pages;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class SearchResults {

    private ElementsCollection results = $$("#ires .g");

    @Step("Get search result at index '{0}'")
    public SelenideElement getResultAt(int index) {
        return results.get(index);

    }
}
