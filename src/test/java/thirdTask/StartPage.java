package thirdTask;

import com.codeborne.selenide.*;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class StartPage {

    private final static String JS_SCRIPT = """
            document.querySelectorAll(\"script\").forEach(src => src.remove()); 
            document.querySelectorAll(\"style\").forEach(stl => stl.remove);
            return document.body.textContent;
            """;

    /**
     * Все элементы (поля), которые содержат текст заполнения.
     * пр.: "Введите имя", "поиск", "ваш телефон" и т.п.
     */
    private final ElementsCollection fillers = $$(byXpath("//*[@placeholder]"));

    private final SelenideElement title = $(byXpath("//title"));

    public StartPage(String url) {
        open(url);
    }

    public String getAllPageText() {
        fillers.shouldHave(CollectionCondition.sizeGreaterThan(0));
        JavascriptExecutor JSExecutor = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        StringBuilder allText = new StringBuilder();
        fillers.stream().forEach(elem -> allText.append(elem.getAttribute("placeholder")));
        allText.append(title.innerText())
                .append(JSExecutor.executeScript(JS_SCRIPT));
        return allText.toString().toLowerCase();
    }
}