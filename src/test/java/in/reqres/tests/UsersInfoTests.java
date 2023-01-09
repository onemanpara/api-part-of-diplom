package in.reqres.tests;

import in.reqres.models.CreateUserModel;
import in.reqres.models.CreateUserResponseModel;
import in.reqres.models.ListOfUsersModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.UserDataRequestSpec.userDataRequestSpec;
import static in.reqres.specs.UserDataResponseSpec.userDataResponseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

public class UsersInfoTests {

    @DisplayName("Создание нового пользователя")
    @Test
    void createUserTest() {
        CreateUserModel user = new CreateUserModel();
        user.setName("Mikhail");
        user.setJob("QA-Engineer");
        CreateUserResponseModel response = given()
                .spec(userDataRequestSpec)
                .when()
                .body(user)
                .post()
                .then()
                .spec(userDataResponseSpec)
                .extract().as(CreateUserResponseModel.class);
        assertThat(response.getName()).isEqualTo("Mikhail");
        assertThat(response.getJob()).isEqualTo("QA-Engineer");
    }


    @DisplayName("Запрос данных о списке пользователей")
    @Test
    void firstUserTest() {
        ListOfUsersModel listOfUsersModel = given()
                .spec(userDataRequestSpec)
                .when()
                .get()
                .then()
                .log().all()
                .extract().as(ListOfUsersModel.class);
        assertThat(listOfUsersModel.getData().get(0).getFirst_name()).isEqualTo("George");
        assertThat(listOfUsersModel.getData().get(0).getLast_name()).isEqualTo("Bluth");
    }

    @DisplayName("Запрос данных о конкретном пользователе")
    @Test
    void singleUserTest() {
        given()
                .spec(userDataRequestSpec)
                .when()
                .get("/5")
                .then()
                .log().all()
                .body("data.last_name", is("Morris"));
    }
}
