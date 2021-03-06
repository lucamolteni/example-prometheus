package com.company;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("sample.fxml");
        Parent root = FXMLLoader.load(resource);
        primaryStage.setTitle("DMN Kie Server");
        primaryStage.setScene(new Scene(root, 300, 350, Color.WHITE));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
