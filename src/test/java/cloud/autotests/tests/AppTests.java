package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests  {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Самый прикольный тест будет тут, а не там")
    void test() {

        step("open 'https://upyachka.ru/'", () -> {
            open("https://upyachka.ru/");
        });

        step("Seen word 'СКЪРО' or 'БЕГN'", () -> {
            $(".main").shouldHave(text("БЕГN"));
        });

    }
}