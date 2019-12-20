package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class MainMenu extends MainController{

    @FXML
    private MenuButton loginLabel;

    private User user;

    public void init(User user)
    {
        this.user = user;
        loginLabel.setText(user.login);
    }

    public void kalkulatorPane(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Kalkulator.fxml"));

            AnchorPane sceneMain = loader.load();


            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }

    public void wzoryPane(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Wzory.fxml"));

            AnchorPane sceneMain = loader.load();


            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }

    public void funkcjePane(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Funkcje.fxml"));

            AnchorPane sceneMain = loader.load();

            Funkcje funkcje = loader.<Funkcje>getController();
            funkcje.init();

            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }

    public void wyloguj(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TrialMenu.fxml"));

            AnchorPane sceneMain = loader.load();


            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }

    public void profil(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profil.fxml"));

            AnchorPane sceneMain = loader.load();

            Profil profil = loader.<Profil>getController();
            profil.init(user);

            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }


}
