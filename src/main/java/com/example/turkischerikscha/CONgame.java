package com.example.turkischerikscha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CONgame {
    @FXML
    Label lb1;
    @FXML
    Button btnUpper;
    @FXML
    Button btnLower;

    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;
    @FXML
    Button btn4;
    @FXML
    Button btn5;
    @FXML
    Button btn6;
    @FXML
    Button btn7;
    @FXML
    Button btn8;
    @FXML
    Button btn9;
    @FXML
    Button btn10;
    @FXML
    Button btn11;
    @FXML
    Button btn12;
    @FXML
    Button btn13;
    @FXML
    Button btn14;
    @FXML
    Button btn15;
    @FXML
    Button btn16;
    @FXML
    AnchorPane ap1;
    @FXML
    ImageView iw1;

    @FXML
    Label lb2;
    communication c;
    String e;

    boolean upper;
    boolean lower;
    private static String[] names = {CONsettings.getSpielerName1(), CONsettings.getSpielerName2(), CONsettings.getSpielerName3(), CONsettings.getSpielerName4(), CONsettings.getSpielerName5(), CONsettings.getSpielerName6()};
    private static int currentIndex = 0;

    public void initialize() throws IOException {

        btnUpper.setStyle("-fx-background-color: #007D6E");
        btnLower.setStyle("-fx-background-color: b75750");

        URL url = new File("src/main/resources/images/bck.png").toURI().toURL();
        Image i = new Image(url.openStream());
        iw1.setImage(i);

        c = new communication();
        c.Feld.printSpielfeld();
        c.frontendEingabe("1,1");
        setCardButton(btn1, translateK(0), 0);
        setCardButton(btn2, "bckq", 4);
        setCardButton(btn3, "bckq", 4);
        setCardButton(btn4, "bckq", 4);
        setCardButton(btn5, translateK(4), 1);
        setCardButton(btn6, "bck", 3);
        setCardButton(btn7, "bck", 3);
        setCardButton(btn8, "bck", 3);
        setCardButton(btn9, translateK(8), 0);
        setCardButton(btn10, "bckq", 4);
        setCardButton(btn11, "bckq", 4);
        setCardButton(btn12, "bckq", 4);
        setCardButton(btn13, translateK(12), 1);
        setCardButton(btn14, "bck", 3);
        setCardButton(btn15, "bck", 3);
        setCardButton(btn16, "bck", 3);
    }

    public static void printNextName() {
        if (currentIndex >= names.length) {
            currentIndex = 1;
        } else {
            String currentName = names[currentIndex];
            System.out.println(currentName);
            currentIndex++;
        }
    }

    public void setCardButton(Button button, String spielkarte, int q) throws IOException {
        //String spielkarte = z.B. schelle7, gras3,...
        String u = null;

        if (q == 0) {
            u = "Spielkarte_" + spielkarte + "background1.png";
            button.setMinSize(40, 60);
            button.setMaxSize(40, 60);
        }
        if (q == 1) {
            u = "SpielkarteQueer_" + spielkarte + "background1.png";
            button.setMinSize(60, 40);
            button.setMaxSize(60, 40);
        }
        if (q == 3) {
            u = spielkarte + ".png";
            button.setMinSize(40, 60);
            button.setMaxSize(40, 60);
        }
        if (q == 4) {
            u = spielkarte + ".png";
            button.setMinSize(60, 40);
            button.setMaxSize(60, 40);
        }
        URL url = new File("src/main/resources/images/cards/" + u).toURI().toURL();
        ImageView iv = new ImageView(new Image(url.openStream()));
        iv.fitHeightProperty().bind(button.heightProperty());
        iv.fitWidthProperty().bind(button.widthProperty());
        button.setGraphic(iv);
    }

    public void OnActionBtn1(ActionEvent actionEvent) {

    }

    public void OnActionBtn6(ActionEvent actionEvent) {
        e = "5";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn6, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn7(ActionEvent actionEvent) {
        e = "6";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn7, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn8(ActionEvent actionEvent) {
        e = "7";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn8, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn9(ActionEvent actionEvent) {
        e = "8";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn9, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn10(ActionEvent actionEvent) {
        e = "9";
        lb1.setText("Higher Lower?");
        System.out.println(c.getGültige());
        //if (gultig(e)) {
        upperLower(btn10, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn11(ActionEvent actionEvent) {
        e = "10";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn11, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn12(ActionEvent actionEvent) {
        e = "11";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn12, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn13(ActionEvent actionEvent) {
        e = "12";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn13, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn14(ActionEvent actionEvent) {
        e = "13";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn14, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn15(ActionEvent actionEvent) {
        e = "14";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn15, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn5(ActionEvent actionEvent) {
        e = "4";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn5, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn3(ActionEvent actionEvent) {
        e = "2";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn3, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn4(ActionEvent actionEvent) {
        e = "3";
        lb1.setText("Higher Lower?");
        //if (gultig(e)) {
        upperLower(btn4, 1, Integer.parseInt(e));
        //}
    }

    public void OnActionBtn2(ActionEvent actionEvent) {
        e = "1";
        lb1.setText("Higher Lower?");
        if (gultig(e)) {
            upperLower(btn2, 1, Integer.parseInt(e));
        }
    }

    public void OnActionBtn16(ActionEvent actionEvent) {
        e = "15";
        lb1.setText("Higher Lower");
        //if (gultig(e)) {
        upperLower(btn16, 0, Integer.parseInt(e));
        //}
    }

    public void OnActionBtnUpper(ActionEvent actionEvent) {
        c.frontendEingabe(e + ",1");
        upper = true;
        printNextName();
    }

    public void OnActionBtnLower(ActionEvent actionEvent) {
        c.frontendEingabe(e + ",2");
        lower = true;
        printNextName();
    }

    public String translateK(int i) {
        String farbe = null;
        String zahl = null;
        String[] parts = c.Feld.s.getId(i).split("_");
        if (parts[1].equals("G")) {
            farbe = "gras";
        }
        else if (parts[1].equals("S")) {
            farbe = "schelle";
        }
        else if (parts[1].equals("H")) {
            farbe = "herz";
        }
        else if (parts[1].equals("E")) {
            farbe = "eichel";
        }
        if (parts[0].equals("7")) {
            zahl = "1";
        }
        if (parts[0].equals("8")) {
            zahl = "2";
        }
        if (parts[0].equals("9")) {
            zahl = "3";
        }
        if (parts[0].equals("10")) {
            zahl = "4";
        }
        if (parts[0].equals("U")) {
            zahl = "5";
        }
        if (parts[0].equals("O")) {
            zahl = "6";
        }
        if (parts[0].equals("K")) {
            zahl = "7";
        }
        if (parts[0].equals("A")) {
            zahl = "8";
        }

        int z = Integer.parseInt(zahl);
        return farbe + z;
    }

    public void upperLower(Button b, int q, int i) {
        if (upper) {
            try {
                setCardButton(b, translateK(Integer.parseInt(e)), q);
                lb2.setText(c.frontendEingabe(i + ",1"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            upper = false;
        }
        if (lower) {
            try {
                setCardButton(b, translateK(Integer.parseInt(e)), q);
                lb2.setText(c.frontendEingabe(i + ",2"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            lower = false;
        }
    }

    public boolean gultig(String i) {
        return true;
    }
}

