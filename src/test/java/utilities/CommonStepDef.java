package utilities;

import io.restassured.response.Response;

/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 11:46 am
 * @mail_to: vermadivakar2022@gmail.com
 */
public interface CommonStepDef {

    public Response login(String mobileNumber, String password, String deviceId);
    public String getDataFromResponse(Response response,String parameter);
}
