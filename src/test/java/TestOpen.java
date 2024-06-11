import com.codeborne.selenide.Condition;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class TestOpen {
    //    "https://test.complexbar.ru/?store_access_key=2e81b3f7d26cdd8045be94462152c4a6";
    //    "https://complexbar.ru/";
    private String url = "https://dev.complexbar.ru/?store_access_key=2e81b3f7d26cdd8045be94462152c4a6";

    @Test
    public void openHomePage() {
        Response response = RestAssured.get(url);
        int statusCode = response.getStatusCode();
        org.junit.jupiter.api.Assertions.assertEquals(200, statusCode, "Страница не возвращает статус 200");
        open(url);
    }

    @Test
    public void openCatalogPage() {
        POM openPage = open(url, POM.class);
        openPage.clickFirstCatalogButton();

    }

    @Test
    public void openProductPage() {
        POM openPage = open(url, POM.class);
        openPage.clickProduct();

    }

    @Test
    public void addProductFromCategory() {
        POM openPage = open(url, POM.class);
        openPage.addProductFromCategory();
        $(byClassName("cb-cart-grid__product-name")).should(exist);

    }

    @Test
    public void addProductFromPageProduct() {
        POM openPage = open(url, POM.class);
        openPage.addProductFromProductPage();
        $(byClassName("cb-cart-grid__product-name")).should(exist);

    }

    @Test
    public void completeOrder() {
        POM openPage = open(url, POM.class);
        openPage.orderCreate();
        $x("//*[@id=\"tygh_main_container\"]/div[2]/div/div/div/div/div[2]/h1/span").shouldHave(Condition.text("Ваш заказ "));


    }

}
