package com.edu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppContacts extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calc Application");
        //
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/contacts.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        //
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
