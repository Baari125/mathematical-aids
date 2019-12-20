package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.event.*;


public class MainController extends Application {

    public static Stage stage;

    public void loginPane(ActionEvent event) throws Exception
    {
        try
        {
            //stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPane.fxml"));

            AnchorPane sceneMain = loader.load();


            Scene scene = new Scene(sceneMain);
            stage.setScene(scene);
//            stage.show();
        } catch (Exception ex) {

        }
    }

    public void trialMenu() throws Exception
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

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.stage = primaryStage;
        mainWindow();
    }

    public void mainWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(MainController.class.getResource("Start.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);

            stage.setTitle("Pomoc matematyczna");
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
