package utilities;

import base.BaseBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 11:22 am
 * @mail_to: vermadivakar2022@gmail.com
 */
public class Utils extends BaseBuilder {

    private static RequestSpecification reqSpec;
    private static Response response;

    public String getEncryptedData(String data){
        reqSpec = RestAssured.given().spec(requestSpecification).queryParam("content",data);
        response = reqSpec.get(GlobalConstant.encryptDataURL);
        return response.getBody().asString();
    }

    public static String getUnixTime() {
        long unix = System.currentTimeMillis();
        return String.valueOf(unix);
    }

}
