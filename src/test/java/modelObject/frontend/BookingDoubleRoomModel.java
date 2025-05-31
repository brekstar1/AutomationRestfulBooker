package modelObject.frontend;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class BookingDoubleRoomModel {

    private String firstnameValue;
    private String lastnameValue;
    private String emailValue;
    private String phoneValue;

    public BookingDoubleRoomModel(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load JSON file: " + jsonFilePath, e);
        }
    }

    public String getFirstnameValue() {
        return firstnameValue;
    }

    public String getLastnameValue() {
        return lastnameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public String getPhoneValue() {
        return phoneValue;
    }
}
