package google;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import google.pages.*;

public class SampleTest {

    @BeforeAll
    public static void init() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @Test
    @Description("Search Something in Google")
    public void googleSearch() {
        open("https://www.google.com");
        new GoogleHome().searchFor("phystem");
        SearchResults searchResults = new SearchResults();
        searchResults.getResultAt(0).shouldHave(text("Taruk MArta"));
    }

}
