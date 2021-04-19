package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Самый прикольный тест будет тут, а не там")
    void test() {

        step("open 'https://upyachka.ru/'", () -> {
            // todo
        });

        step("Seen word 'СКЪРО' or 'БЕГN'", () -> {
            // todo
        });

    }
}