package loggerUtility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {
    private static final Logger logger = LogManager.getLogger();

    public static void startTest(String testName){
        logger.info("===== EXECUTION STARTED: " + testName + " =====");
    }

    public static void finishTest(String testName){
        logger.info("===== EXECUTION FINISHED: " + testName + " =====");
    }

    public static void infoLog(String message) {
        logger.info(message);
    }

    public static void requestLogs(RequestSpecification requestSpecification, String path, String methodType) {
        infoLog("=== Request INFO ===");
        infoLog(getRequestURL(path));
        infoLog(getRequestMethod(methodType));
        infoLog(getRequestBody(requestSpecification));
    }

    public static void responseLogs(Response response) {
        infoLog("=== Response INFO ===");
        infoLog(getResponseStatusCode(response));
        infoLog(getResponseStatus(response));
        infoLog(getResponseBody(response));
    }

    private static String getRequestURL(String path){
        return "Request URI: https://restful-booker.herokuapp.com"+path;
    }

    private static String getRequestMethod(String methodType){
        return "Request METHOD: "+methodType;
    }

    private static String getResponseStatus(Response response) {
        return "Response STATUS: " + response.getStatusLine();
    }

    private static String getResponseStatusCode(Response response) {
        return "Response STATUS CODE: " + response.getStatusCode();
    }

    /*@SneakyThrows(JsonProcessingException.class)
    private static String getRequestBody(RequestSpecification requestSpecification) {
        String requestBodyMessage = "Request BODY: \n";

        Object requestBody = ((RequestSpecificationImpl) requestSpecification).getBody();
        if (requestBody != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            requestBodyMessage += objectMapper.readTree(requestBody.toString()).toPrettyString();
        }

        return requestBodyMessage;
    }*/

    private static String getRequestBody(RequestSpecification requestSpecification) {
        String requestBodyMessage = "Request BODY: \n";

        Object requestBody = ((RequestSpecificationImpl) requestSpecification).getBody();
        if (requestBody != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                requestBodyMessage += objectMapper.readTree(requestBody.toString()).toPrettyString();
            } catch (JsonProcessingException e) {
                requestBodyMessage += "Unable to parse request body: " + e.getMessage();
            }
        }

        return requestBodyMessage;
    }


    private static String getResponseBody(Response response) {
        String responseBodyMessage = "Response BODY: \n";

        if (response.getBody() != null) {
            return responseBodyMessage + response.getBody().asPrettyString();
        } else  {
            return "";
        }
    }
}
