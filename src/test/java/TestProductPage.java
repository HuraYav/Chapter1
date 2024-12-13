import com.codeborne.selenide.WebDriverRunner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestProductPage {
    @Test
    public void openProductPage() {
        open(Base.url);
        POM pom = new POM();
        pom.clickProduct();
        String currentUrl = WebDriverRunner.url();
        Response response = RestAssured.get(currentUrl);
        int statusCode = response.getStatusCode();
        org.junit.jupiter.api.Assertions.assertEquals(200, statusCode, "Страница не возвращает статус 200");
    }

    @Test
    public void addProductFromPageProduct() {
        open(Base.url);
        POM pom = new POM();
        pom.addProductFromProductPage();
        $(byClassName("cb-cart-grid__product-name")).should(exist);
    }
}
