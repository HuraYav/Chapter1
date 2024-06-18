import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestOrderPage {
    @Test
    public void completeOrder() {
        open(Base.url);
        POM pom = new POM();
        pom.orderCreate();
        $(".ty-checkout-complete__header").shouldHave(Condition.text("Ваш заказ "));


    }
}
