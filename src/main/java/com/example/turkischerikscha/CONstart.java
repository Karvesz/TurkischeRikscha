package com.example.turkischerikscha;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CONstart {

    @FXML
    public Button btnStart1;

    @FXML
    protected void OnActionStart(ActionEvent event) {
        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    new APPsettings().start(new Stage());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Stage stage = (Stage) btnStart1.getScene().getWindow();
        stage.close();
    }
}
