package modelObject.frontend;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;

@Getter
public class BookingSingleRoomModel {

    private String firstnameValue;
    private String lastnameValue;
    private String emailValue;
    private String phoneValue;

    public BookingSingleRoomModel(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load JSON file: " + jsonFilePath, e);
        }
    }
}
