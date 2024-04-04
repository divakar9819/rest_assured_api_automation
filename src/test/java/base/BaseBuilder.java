package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.PropertyReader;

/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 11:01 am
 * @mail_to: vermadivakar2022@gmail.com
 */
public class BaseBuilder {

    private static RequestSpecBuilder builder;
    public static RequestSpecification requestSpecification;

    private static PropertyReader reader ;

    public BaseBuilder (){
        System.out.println("basebuilder");
        builder = new RequestSpecBuilder();
        reader = new PropertyReader();
        String env = reader.getValueFromConfig("env");
        if(env.equalsIgnoreCase("dev")){
            builder.setBaseUri(reader.getValueFromConfig("dev.env.host"));
        }
        else if(env.equalsIgnoreCase("uat")){
            builder.setBaseUri(reader.getValueFromConfig("uat.env.host"));
        }
        else {
            builder.setBaseUri(reader.getValueFromConfig("local.host.env"));
        }

        builder.setContentType("application/json");
        requestSpecification = builder.build();
    }

//    public RequestSpecification placeSpecBuilder(){
//        builder = new RequestSpecBuilder();
//        reader = new PropertyReader();
//        String env = reader.getValueFromConfig("env");
//        if(env.equalsIgnoreCase("dev")){
//            builder.setBaseUri(reader.getValueFromConfig("dev.env.host"));
//        }
//        else if(env.equalsIgnoreCase("uat")){
//            builder.setBaseUri(reader.getValueFromConfig("uat.env.host"));
//        }
//        else {
//            builder.setBaseUri(reader.getValueFromConfig("local.host.env"));
//        }
//
//        builder.setContentType("application/json");
//        reqSpec = builder.build();
//        return reqSpec;
//    }

}
