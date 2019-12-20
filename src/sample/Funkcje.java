package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Funkcje {

    @FXML
    private ImageView wykres;

    @FXML
    private TextField sin;

    @FXML
    private TextField cos;

    @FXML
    private TextField tg;

    @FXML
    private Label sinOutput;

    @FXML
    private Label cosOutput;

    @FXML Label tgOutput;

    public void init()
    {
        File file = new File("figury\\trygo.png");
        Image image = new Image(file.toURI().toString());
        this.wykres.setImage(image);
    }

    public void sinus()
    {
        double value = Integer.parseInt(sin.getText());
        Double kat = Math.sin(Math.toRadians(value));
        sinOutput.setText(kat.toString());
    }

    public void cosinus()
    {
        double value = Integer.parseInt(cos.getText());
        Double kat = Math.cos(Math.toRadians(value));
        cosOutput.setText(kat.toString());
    }

    public void tangens()
    {
        double value = Integer.parseInt(tg.getText());
        Double kat = Math.tan(Math.toRadians(value));
        tgOutput.setText(kat.toString());
    }

}
