package com.example.turkischerikscha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CONsettings {
    int amount;

    @FXML
    public TextField tfAmount;
    public Label lHowMany;
    public TextField tfName1;
    public TextField tfName2;
    public TextField tfName3;
    public TextField tfName4;
    public TextField tfName5;
    public TextField tfName6;

    public void OnActionAmount(ActionEvent actionEvent) {
        amount = Integer.parseInt(tfAmount.getText());
        lHowMany.setText("Namen eintragen");

        if (amount > 1) {
            tfName1.setVisible(true);
            if (amount >= 2) {
                tfName2.setVisible(true);
                if (amount >= 3) {
                    tfName3.setVisible(true);
                    if (amount >= 4) {
                        tfName4.setVisible(true);
                        if (amount >= 5) {
                            tfName5.setVisible(true);
                            if (amount >= 6) {
                                tfName6.setVisible(true);
                            }
                        }
                    }

                }

            }
        }

        else {
            lHowMany.setText("Not valid");
        }
    }

}
