package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Wzory {

    @FXML
    private Label figura;

    @FXML
    private Label poleFigury;

    @FXML
    private Label objetoscFigury;

    @FXML
    private ImageView obraz;

    public void kwadrat(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: a*a");
        objetoscFigury.setText("");
        File file = new File("figury\\kwadrat.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void prostokat(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: a*b");
        objetoscFigury.setText("");
        File file = new File("figury\\prostokat.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void trapez(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: (a+b)*h / 2");
        objetoscFigury.setText("");
        File file = new File("figury\\trapez.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void rownoleglobok(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: a*h || a*b*sinα");
        objetoscFigury.setText("");
        File file = new File("figury\\rownoleglobok.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void romb(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: a*h || a*a*sinα");
        objetoscFigury.setText("");
        File file = new File("figury\\romb.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void deltoid(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: 1/2 * |AC| * |BD|");
        objetoscFigury.setText("");
        File file = new File("figury\\deltoid.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void trojkat(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: 1/2 * a*h");
        objetoscFigury.setText("");
        File file = new File("figury\\trojkat.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void kolo(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: π * r*r");
        objetoscFigury.setText("Obwód: 2*π*r");
        File file = new File("figury\\kolo.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void prostopadloscian(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: 2*(a+b+H)");
        objetoscFigury.setText("Objetość: a*b*H");
        File file = new File("figury\\prostopadloscian.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void ostroslup(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Objetość: 1/3 *Pp*H");
        objetoscFigury.setText("");
        File file = new File("figury\\ostroslup.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void walec(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: 2*π*r*(r+H)");
        objetoscFigury.setText("Objetość: π*r*r * H");
        File file = new File("figury\\walec.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void stozek(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: π*r*(r+l)");
        objetoscFigury.setText("Objetość: 1/3 * π*r*r * H");
        File file = new File("figury\\stozek.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }

    public void kula(ActionEvent event)
    {
        figura.setText(((Button)event.getSource()).getText());
        poleFigury.setText("Pole: 4*π*r*r");
        objetoscFigury.setText("Objetość: 4/3 * π * r*r*r");
        File file = new File("figury\\kula.png");
        Image image = new Image(file.toURI().toString());
        obraz.setImage(image);
    }
}
