package utilities;

import base.BaseBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;

import static utilities.GlobalConstant.HTTP_OK;
import static utilities.Utils.getUnixTime;

/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 11:44 am
 * @mail_to: vermadivakar2022@gmail.com
 */
public class CommonStepDefImpl extends BaseBuilder implements CommonStepDef {

    private static Utils utils = new Utils();


    @Override
    public Response login(String mobileNumber, String passcode, String deviceId) {
        HashMap<String, String> loginDetails = new HashMap<>();
        String deviceAndUnixTime = deviceId + "," + getUnixTime();
        String loginDetailsStr = utils.getEncryptedData("{   \"mobileNumber\": \"" + mobileNumber
                + "\",   \"passcode\": \"" + passcode + "\",   \"deviceId\": \"" + deviceAndUnixTime + "\" , \"newDeviceId\": \"" + deviceId + "\" }");
        loginDetails.put("loginDetails", loginDetailsStr);
        Response response = RestAssured.given().spec(requestSpecification).body(loginDetails).post(GlobalConstant.mobileLoginURL).then().extract().response();
        if(response.getStatusCode()!=HTTP_OK){
            throw new RuntimeException(response.getBody().asString());
        }
        else {
            return response;
        }
    }

    @Override
    public String getDataFromResponse(Response response,String parameter) {
        String responseBody = response.getBody().asString();
        JSONObject jsonObject = new JSONObject(responseBody);
        String data = jsonObject.getString(parameter);
        return data;
    }

}
