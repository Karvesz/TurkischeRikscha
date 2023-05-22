package com.example.turkischerikscha;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

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
    public TextField tfAge1;
    public TextField tfAge2;
    public TextField tfAge3;
    public TextField tfAge4;
    public TextField tfAge5;
    public TextField tfAge6;
    public Button btnStart;

    String na = "Kein Name";
    String name1 = na;
    String name2 = na;
    String name3 = na;
    String name4 = na;
    String name5 = na;
    String name6 = na;
    int age1 = 0;
    int age2 = 0;
    int age3 = 0;
    int age4 = 0;
    int age5 = 0;
    int age6 = 0;

    public void OnActionAmount(ActionEvent actionEvent) {
        amount = Integer.parseInt(tfAmount.getText());
        lHowMany.setText("Namen eintragen");

        //set every tf on invisible
        tfName1.setVisible(false);
        tfName2.setVisible(false);
        tfName3.setVisible(false);
        tfName4.setVisible(false);
        tfName5.setVisible(false);
        tfName6.setVisible(false);

        tfAge1.setVisible(false);
        tfAge2.setVisible(false);
        tfAge3.setVisible(false);
        tfAge4.setVisible(false);
        tfAge5.setVisible(false);
        tfAge6.setVisible(false);


        if (amount > 1) {
            tfName1.setVisible(true);
            tfAge1.setVisible(true);
            if (amount >= 2) {
                tfName2.setVisible(true);
                tfAge2.setVisible(true);
                System.out.println(name1);
                if (amount >= 3) {
                    tfName3.setVisible(true);
                    tfAge3.setVisible(true);
                    if (amount >= 4) {
                        tfName4.setVisible(true);
                        tfAge4.setVisible(true);
                        if (amount >= 5) {
                            tfName5.setVisible(true);
                            tfAge5.setVisible(true);
                            if (amount >= 6) {
                                tfName6.setVisible(true);
                                tfAge6.setVisible(true);
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

    public void OnActionStart(ActionEvent actionEvent) {

        //Creating strings for names
        name1 = tfName1.getText();
        name2 = tfName2.getText();
        name3 = tfName3.getText();
        name4 = tfName4.getText();
        name5 = tfName5.getText();
        name6 = tfName6.getText();

        //Creating ints for ages
        age1 = Integer.parseInt(tfAge1.getText());
        age2 = Integer.parseInt(tfAge1.getText());
        age3= Integer.parseInt(tfAge1.getText());
        age4 = Integer.parseInt(tfAge1.getText());
        age5 = Integer.parseInt(tfAge1.getText());
        age6 = Integer.parseInt(tfAge1.getText());

        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    new APPgame().start(new Stage());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Stage stage = (Stage) btnStart.getScene().getWindow();
        stage.close();
        testNameAge();
    }

    public void testNameAge() {
        System.out.println("Player 1:  Name: " + name1);
        System.out.println("           Age: " + age1);
        System.out.println("Player 2:  Name: " + name2);
        System.out.println("           Age: " + age2);
        System.out.println("Player 3:  Name: " + name3);
        System.out.println("           Age: " + age3);
        System.out.println("Player 4:  Name: " + name4);
        System.out.println("           Age: " + age4);
        System.out.println("Player 5:  Name: " + name5);
        System.out.println("           Age: " + age5);
        System.out.println("Player 6:  Name: " + name6);
        System.out.println("           Age: " + age6);
    }
}
