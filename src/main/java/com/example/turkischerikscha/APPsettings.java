package com.example.turkischerikscha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class APPsettings extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public  void start(Stage primaryStage) throws IOException {
        URL url = new File("src/main/resources/FXMLsettings.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 368, 690);

        primaryStage.setTitle("Türkische Rikschafahrt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
