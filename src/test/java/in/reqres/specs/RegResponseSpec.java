package in.reqres.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.filter.log.LogDetail.*;

public class RegResponseSpec {

    public static ResponseSpecification regResponseSpec = new ResponseSpecBuilder()
            .log(ALL)
            .build();


}
