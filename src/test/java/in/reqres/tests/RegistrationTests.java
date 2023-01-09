package in.reqres.tests;

import in.reqres.models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.RegRequestSpec.regRequestSpec;
import static in.reqres.specs.RegResponseSpec.regResponseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;

public class RegistrationTests {

    @DisplayName("Позитивная регистрация пользователя")
    @Test
    void regPositiveTest() {
        RegRequestModel regData = new RegRequestModel();
        regData.setEmail("eve.holt@reqres.in");
        regData.setPassword("randomPassword");
        RegResponseModel response = given()
                .spec(regRequestSpec)
                .when()
                .body(regData)
                .post()
                .then()
                .spec(regResponseSpec)
                .statusCode(200)
                .extract().as(RegResponseModel.class);
        assertThat(response.getId()).isEqualTo("4");
        assertThat(response.getToken()).isEqualTo("QpwL5tke4Pnpja7X4");
    }

    @DisplayName("Регистрация пользователя без доступа")
    @Test
    void regWithoutAccessTest() {
        RegRequestModel regData = new RegRequestModel();
        regData.setEmail("testmail@gmail.com");
        regData.setPassword("randomPassword");
        given()
                .spec(regRequestSpec)
                .when()
                .body(regData)
                .post()
                .then()
                .spec(regResponseSpec)
                .statusCode(400)
                .body("error", is("Note: Only defined users succeed registration"));
    }

    @DisplayName("Негативный тест на регистрацию (без пароля)")
    @Test
    void regWithoutPasswordTest() {
        RegRequestModel regData = new RegRequestModel();
        regData.setEmail("eve.holt@reqres.in");
        given()
                .spec(regRequestSpec)
                .when()
                .body(regData)
                .post()
                .then()
                .spec(regResponseSpec)
                .statusCode(400)
                .body("error", is("Missing password"));
    }
}
