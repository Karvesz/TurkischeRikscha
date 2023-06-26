package com.example.turkischerikscha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static javafx.application.Application.launch;

public class APPstart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = new File("src/main/resources/FXMLstart.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 368, 690);

        primaryStage.setTitle("Türkische Rikschafahrt");
        URL url1 = new File("src/main/resources/images/S2_Logo.png").toURI().toURL();
        primaryStage.getIcons().add(new Image(url1.openStream()));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
