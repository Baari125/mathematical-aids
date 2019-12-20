package sample;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonNode;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.*;
import java.io.FileOutputStream;

public class RegisterController{

    @FXML
    private JFXTextField loginInput;

    @FXML
    private JFXPasswordField passwordInput;

    @FXML
    private JFXTextField nameInput;

    @FXML
    private JFXTextField surnameInput;

    @FXML
    private Label error;

    public void register() {
        String login = loginInput.getText();
        String haslo = passwordInput.getText();
        String imie = nameInput.getText();
        String nazwisko = surnameInput.getText();

        File f = new File(("Baza\\" + login + ".json"));


        if(f.exists())
            error.setText("Użytkownik o podanym loginie juz istnieje");
        else {

            ObjectMapper objectMapper = new ObjectMapper();
            User user = new User(login, haslo, imie, nazwisko);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            try {
                objectMapper.writeValue(new FileOutputStream("Baza\\" + login + ".json"), user);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPane.fxml"));
                AnchorPane sceneMain = loader.load();
                Scene scene = new Scene(sceneMain);
                MainController.stage.setScene(scene);
            } catch (Exception ex) { }
        }
    }

}