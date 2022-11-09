package thirdTask;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartPageTest extends BaseTest {

    private static final List<String> FIRST_PERS_PRON =
            Arrays.asList("я", "мы", "меня", "нас", "мне", "нам", "мной", "нами");

    private static final List<String> OTHER_PRON =
            Arrays.asList("ты", "вы", "он", "она", "оно", "они", "тебя", "вас", "его", "ее",
                    "его", "их", "тебе", "вам", "ему", "ей", "им", "тобой", "вами", "ею", "ими",
                    "нем", "ней", "них");

    private static final String URL = "https://qna.habr.com/q/810407";

    @Test
    public void pronAmountTest() {
        StartPage startPage = new StartPage(URL);
        String allText = startPage.getAllPageText();
        int firstPersPronAmount = countPronAmount(FIRST_PERS_PRON, allText);
        int otherPronAmount = countPronAmount(OTHER_PRON, allText);
        assertTrue(firstPersPronAmount > otherPronAmount);
    }

    private int countPronAmount(List<String> words, String allTexts) {
        int amount = 0;
        Pattern pattern = Pattern.compile(("(?<![А-яA-z0-9])(" + String.join("|", words) + ")(?![А-яA-z0-9])"));
            Matcher matcher = pattern.matcher(allTexts);
            while (matcher.find()) {
                amount++;
        }
        return amount;
    }
}
