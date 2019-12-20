package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Kalkulator {

    @FXML
    private Label wynik;

    private int liczba1 = 0;
    private String operacja = "";

    @FXML
    private void numberButton(ActionEvent event)
    {
        String value = ((Button)event.getSource()).getText();
        wynik.setText(wynik.getText() + value);
    }

    public void actionButton(ActionEvent event)
    {
        String value = ((Button)event.getSource()).getText();

        if("=".equals(value))
        {
            if(operacja.isEmpty())
                return;

            wynik.setText(String.valueOf(obliczenia(liczba1, Integer.parseInt(wynik.getText()), operacja)));
            operacja = "";
        }
        else
        {
            if(!operacja.isEmpty())
                return;

            operacja = value;
            liczba1 = Integer.parseInt(wynik.getText());
            wynik.setText("");
        }
    }

    private int obliczenia(int liczba1, int liczba2, String operacja)
    {
        switch (operacja) {
            case "+":
                return liczba1 + liczba2;
            case "-":
                return liczba1 - liczba2;
            case "*":
                return liczba1 * liczba2;
            case "/":
                if (liczba2 == 0)
                    return 0;

                return liczba1 / liczba2;
        }
        return 0;
    }
}
