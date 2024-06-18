import com.codeborne.selenide.WebDriverRunner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestCategoryPage {
    @Test
    public void openCatalogPage() {
        open(Base.url);
        POM pom = new POM();
        pom.clickFirstCatalogButton();

        String currentUrl = WebDriverRunner.url();
        Response response = RestAssured.get(currentUrl);
        int statusCode = response.getStatusCode();
        org.junit.jupiter.api.Assertions.assertEquals(200, statusCode, "Страница не возвращает статус 200");

    }

    @Test
    public void addProductFromCategoryTest() {
        open(Base.url);
        POM pom = new POM();
        pom.addProductFromCategory();
        $(byClassName("cb-cart-grid__product-name")).should(exist);

    }
}
