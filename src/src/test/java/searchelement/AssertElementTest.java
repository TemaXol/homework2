package searchelement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AssertElementTest {





    @Test
    void AssertionSearch() {

        //открыть  github на странице selenide
        open("https://github.com/selenide/selenide");
        //перейти в раздел Wiki проекта
        $("#wiki-tab").click();
        //открыть весь список элементов Pages
        $(byXpath("//button[@class='f6 Link--muted js-wiki-more-pages-link btn-link mx-auto']")).click();
        //убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $$("[data-filterable-type=substring]").findBy(visible).shouldHave(text("SoftAssertions"));
        //перейти на страницу SoftAssertions
        $(byText("SoftAssertions")).click();
        //проверить, что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}
