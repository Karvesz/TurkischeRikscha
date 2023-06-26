package com.example.turkischerikscha;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

public class APPgame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = new File("src/main/resources/FXMLgame.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 368, 690);

        FileInputStream input = new FileInputStream("src/main/resources/images/cards/Spielkarte_eichel1background1.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Button btn1 = new Button("", imageView);

        primaryStage.setTitle("Türkische Rikschafahrt");
        URL url1 = new File("src/main/resources/images/S2_Logo.png").toURI().toURL();
        primaryStage.getIcons().add(new Image(url1.openStream()));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
