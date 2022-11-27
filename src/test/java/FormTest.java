import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class FormTest {
    @Test
    void FormTestWithSelenide() {
        Selenide.open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Литвинов Артем");
        $("[data-test-id=phone] input").setValue("+79236771616");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

        //Assertions.assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", $("[data-test-id=order-success]"));


    }
}
