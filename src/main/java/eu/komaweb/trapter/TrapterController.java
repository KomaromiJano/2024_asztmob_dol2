/*
 * File: TrapterController.java
 * Author: Komáromi János
 * Copyright: 2024, Komáromi János
 * Group: Szoft II/1/N
 * Date: 2024-11-12
 * Github: https://github.com/komacraft12/
 * Licenc: GNU GPL
 */

package eu.komaweb.trapter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TrapterController {
    @FXML
    private Label LabelTitle, LabelASide, LabelBSide, LabelCSide, LabelDSide, LabelArea;
    public TextField TextFieldASide, TextFieldBSide, TextFieldCSide, TextFieldDSide, TextFieldArea;

    @FXML
    public void Calcalute(ActionEvent actionEvent) {

        try {
            double a = Double.parseDouble(TextFieldASide.getText());
            double b = Double.parseDouble(TextFieldBSide.getText());
            double c = Double.parseDouble(TextFieldCSide.getText());
            double d = Double.parseDouble(TextFieldDSide.getText());

            double numerator = (a + c);
            double denominator = 4 * (a - c);
            double sqrtPart = Math.sqrt((a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d));

            double area = (numerator / denominator) * sqrtPart;

            System.out.println(numerator);
            System.out.println(denominator);
            System.out.println(sqrtPart);

            System.out.println(area);

            TextFieldArea.setText(String.format("%.12f", area));
        } catch (NumberFormatException e) {
            TextFieldArea.setText("Helytelen bemenet");
        } catch (ArithmeticException e) {
            TextFieldArea.setText("Számítási hiba");
        }

    }
}