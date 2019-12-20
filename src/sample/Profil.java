package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Profil {
    @FXML
    private Label login;
    @FXML
    private Label name;
    @FXML
    private Label subname;

    public void init(User user)
    {
        login.setText("Login: " + user.login);
        name.setText("Name: " + user.name);
        subname.setText("Subname: " + user.subname);
    }
}
