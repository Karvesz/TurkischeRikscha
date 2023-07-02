package com.example.turkischerikscha;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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
    @FXML
    public ImageView iw1;
    @FXML
    public AnchorPane ap1;

    public static Spieler sp1;
    public static Spieler sp2;
    public static Spieler sp3;
    public static Spieler sp4;
    public static Spieler sp5;
    public static Spieler sp6;

    public BinaryTree<Spieler> spielerBaum;
    private Spieler aktuellerSpieler;
    private Spielfeld Feld;

    @FXML
    public void initialize() {
        btnStart.setStyle("-fx-background-color: #dbbea1");
        tfAmount.setStyle("-fx-background-color: #dbbea1");
    }

    public void OnActionAmount(ActionEvent actionEvent) {

        lHowMany.setText("Name/Alter eingeben");

        amount = Integer.parseInt(tfAmount.getText());

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
            tfName1.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
            tfAge1.setVisible(true);
            tfAge1.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
            if (amount >= 2) {
                tfName2.setVisible(true);
                tfName2.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                tfAge2.setVisible(true);
                tfAge2.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                if (amount >= 3) {
                    tfName3.setVisible(true);
                    tfName3.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                    tfAge3.setVisible(true);
                    tfAge3.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                    if (amount >= 4) {
                        tfName4.setVisible(true);
                        tfName4.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                        tfAge4.setVisible(true);
                        tfAge4.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                        if (amount >= 5) {
                            tfName5.setVisible(true);
                            tfName5.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                            tfAge5.setVisible(true);
                            tfAge5.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                            if (amount >= 6) {
                                tfName6.setVisible(true);
                                tfName6.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                                tfAge6.setVisible(true);
                                tfAge6.setStyle("-fx-background-color: #dbbea1;" + "-fx-prompt-text-fill: #254441;");
                            }
                        }
                    }
                }
            }
        }

        else {
            lHowMany.setText("Ungültig");
        }
    }

    public void OnActionStart(ActionEvent actionEvent) {
        sp1 = new Spieler(tfName1.getText(), Integer.parseInt(tfAge1.getText()));
        sp2 = new Spieler(tfName2.getText(), Integer.parseInt(tfAge2.getText()));
        if (!tfName3.getText().equals("") && !Objects.equals(tfAge3.getText(), ""))
            sp3 = new Spieler(tfName3.getText(), Integer.parseInt(tfAge3.getText()));
        else sp3 = new Spieler("ka", 0);
        if (!tfName4.getText().equals("") && !Objects.equals(tfAge4.getText(), ""))
            sp4 = new Spieler(tfName4.getText(), Integer.parseInt(tfAge4.getText()));
        else sp4 = new Spieler("ka", 0);
        if (!tfName5.getText().equals("") && !Objects.equals(tfAge5.getText(), ""))
            sp5 = new Spieler(tfName5.getText(), Integer.parseInt(tfAge5.getText()));
        else sp5 = new Spieler("ka", 0);
        if (!tfName6.getText().equals("") && !Objects.equals(tfAge6.getText(), ""))
            sp6 = new Spieler(tfName6.getText(), Integer.parseInt(tfAge6.getText()));
        else sp6 = new Spieler("ka", 0);

        if (sp1.getAlter() < 18 || sp2.getAlter() < 18 || sp3.getAlter() < 18 || sp4.getAlter() < 18 || sp5.getAlter() < 18 || sp6.getAlter() < 18) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("WARNUNG");
            alert.setHeaderText("Alkohol Warnung");
            alert.setContentText("Sie haben Spieler unter 18 Jahren angegeben. \n" +
                    "Bitte beachten Sie, dass der Konsum von Hochprozentigem erst ab 18 Jahren erlaubt ist. \n" + "Es werden statt Schlücken Liegestütze als Strafe verteilt.");

            alert.showAndWait();
        }
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
    }

    public void OnActiontfName1(ActionEvent actionEvent) {
        sp1.setName(tfName1.getText());
    }

    public void OnActiontfName2(ActionEvent actionEvent) {
        sp2.setName(tfName2.getText());
    }

    public void OnActiontfName3(ActionEvent actionEvent) {
        sp3.setName(tfName3.getText());
    }

    public void OnActiontfName4(ActionEvent actionEvent) {
        sp4.setName(tfName4.getText());
    }

    public void OnActiontfName5(ActionEvent actionEvent) {
        sp5.setName(tfName5.getText());
    }

    public void OnActiontfName6(ActionEvent actionEvent) {
        sp6.setName(tfName6.getText());
    }

    public void OnActiontfAge1(InputMethodEvent inputMethodEvent) {
        sp1.setAlter(Integer.parseInt(tfAge1.getText()));
    }

    public void OnActiontfAge2(InputMethodEvent inputMethodEvent) {
        sp2.setAlter(Integer.parseInt(tfAge2.getText()));
    }

    public void OnActiontfAge3(InputMethodEvent inputMethodEvent) {
        sp3.setAlter(Integer.parseInt(tfAge3.getText()));
    }

    public void OnActiontfAge4(InputMethodEvent inputMethodEvent) {
        sp4.setAlter(Integer.parseInt(tfAge4.getText()));
    }

    public void OnActiontfAge5(InputMethodEvent inputMethodEvent) {
        sp5.setAlter(Integer.parseInt(tfAge5.getText()));
    }

    public void OnActiontfAge6(InputMethodEvent inputMethodEvent) {
        sp6.setAlter(Integer.parseInt(tfAge6.getText()));
    }

    public static String getSpielerName1() {
        return sp1.getName();
    }

    public static String getSpielerName2() {
        return sp2.getName();
    }

    public static String getSpielerName3() {
        return sp3.getName();
    }

    public static String getSpielerName4() {
        return sp4.getName();
    }

    public static String getSpielerName5() {
        return sp5.getName();
    }

    public static String getSpielerName6() {
        return sp6.getName();
    }
    public static int getSpielerAlter1() {
        return sp1.getAlter();
    }
    public static int getSpielerAlter2() {
        return sp2.getAlter();
    }
    public static int getSpielerAlter3() {
        return sp3.getAlter();
    }
    public static int getSpielerAlter4() {
        return sp4.getAlter();
    }
    public static int getSpielerAlter5() {
        return sp5.getAlter();
    }
    public static int getSpielerAlter6() {
        return sp6.getAlter();
    }
}
