package requestSpecifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.PropertyLoader;

public class RequestSpecifications {

    public static RequestSpecification basicSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri(PropertyLoader.getProperty("URL"))
            .build();
}
