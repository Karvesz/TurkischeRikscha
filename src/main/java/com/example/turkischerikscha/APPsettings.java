package com.example.turkischerikscha;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class APPsettings extends Application {
    @FXML
    AnchorPane ap1;
    @FXML
    ImageView iw1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = new File("src/main/resources/FXMLsettings.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 368, 690);
        scene.setFill(Color.web("#FFE5DE"));
        root.setStyle("-fx-background-color: #254441");

        primaryStage.setTitle("Türkische Rikschafahrt");
        URL url1 = new File("src/main/resources/images/S2_Logo.png").toURI().toURL();
        primaryStage.getIcons().add(new Image(url1.openStream()));
        primaryStage.setScene(scene);
        primaryStage.show();

        iw1.fitWidthProperty().bind(primaryStage.widthProperty());
        iw1.fitHeightProperty().bind(primaryStage.heightProperty());
    }
}
