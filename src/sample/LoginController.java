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
import javafx.stage.Stage;

import java.io.File;

public class LoginController {

    public static Stage stage;

    @FXML
    private JFXTextField loginInput;

    @FXML
    private JFXPasswordField passwordInput;

    @FXML
    private Label error;

    public void logIn() throws Exception
    {
        String login = loginInput.getText();
        String password = passwordInput.getText();

        File f = new File(("Baza\\" + login + ".json"));

        if(!f.exists())
            error.setText("Użytkownik o podanym loginie nie istnieje");
        else {
            ObjectMapper objectMapper = new ObjectMapper();

            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            User user = objectMapper.readValue(new File("Baza\\" + login + ".json"), User.class);

            if(!password.equals(user.getPassword()))
                error.setText("Podano błędne hasło");
            else {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
                    AnchorPane sceneMain = loader.load();

                    MainMenu menu = loader.<MainMenu>getController();
                    menu.init(user);

                    Scene scene = new Scene(sceneMain);
                    MainController.stage.setScene(scene);
                } catch (Exception ex) { }
            }
        }
    }

    public void goToRegister() throws Exception
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegisterView.fxml"));
            AnchorPane sceneMain = loader.load();
            Scene scene = new Scene(sceneMain);
            MainController.stage.setScene(scene);
        } catch (Exception ex) {

        }
    }

    public void backButton() throws Exception
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Start.fxml"));
            AnchorPane sceneMain = loader.load();
            Scene scene = new Scene(sceneMain);
            MainController.stage.setScene(scene);
        } catch (Exception ex) {

        }
    }
}
