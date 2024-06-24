import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestHomePage {
    @Test
    public void openHomePage() {
        Response response = RestAssured.get(Base.url);
        int statusCode = response.getStatusCode();
        org.junit.jupiter.api.Assertions.assertEquals(200, statusCode, "Страница не возвращает статус 200");
        open(Base.url);
    }
}
