package com.edu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calc Application");
        //
        /*
        InputStream iconStream = getClass().getResourceAsStream("/calc2.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);
        //
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(helloWorldLabel);
        primaryStage.setScene(primaryScene);
        */
        //
        /*
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/calc.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        //
        primaryStage.setScene(new Scene(root));
        //primaryStage.show();
        */
        //
        // /*
        Label label;
        TextField tf;
        Button button;
        VBox vbox;
        Scene scene;
        //
        tf = new TextField("Text Field!");
        tf.setMaxWidth(200);
        //
        label = new Label("Type text and click the button");
        button = new Button("Click");
        //
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                label.setText(tf.getText());
            }
        });
        //
        vbox = new VBox(label, tf, button);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        scene = new Scene(vbox, 300, 200);
        //
        primaryStage.setTitle("A Simple Scene!");
        primaryStage.setScene(scene);
        // */
        //
        /*
        Label label = new Label("0");
        //
        TextField textField = new TextField("0");
        textField.setMaxWidth(200);
        textField.setAlignment(Pos.TOP_RIGHT);
        textField.setEditable(false);
        //
        Button button0 = new Button("0");
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        //
        Button button1 = new Button("1");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        //
        Button button2 = new Button("2");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        //
        Button button3 = new Button("3");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        //
        Button buttonPlus = new Button("+");
        buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                label.setText(textField.getText());
                textField.setText("0");
            }
        });
        //
        Button buttonEquals = new Button("=");
        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                long val1 = Long.valueOf(label.getText());
                long val2 = Long.valueOf(textField.getText());
                textField.setText(String.valueOf(val1 + val2));
                label.setText("0");
            }
        });
        //
        Button buttonCleanup = new Button("C");
        buttonCleanup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                label.setText("0");
                textField.setText("0");
            }
        });
        //
        Button buttonBack = new Button("<");
        buttonBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int len = textField.getText().length();
                if (len > 1) {
                    textField.setText(textField.getText().substring(0, len - 1));
                }
            }
        });
        //
        HBox hboxTop = new HBox(label);
        hboxTop.setAlignment(Pos.CENTER);
        //
        HBox hboxText = new HBox(textField);
        //hboxText.setSpacing(5);
        hboxText.setAlignment(Pos.CENTER);
        //
        HBox hbox123p = new HBox(button1, button2, button3, buttonPlus);
        hbox123p.setSpacing(5);
        hbox123p.setAlignment(Pos.CENTER);
        //
        HBox hbox0 = new HBox(button0, buttonEquals);
        hbox0.setSpacing(62);
        hbox0.setAlignment(Pos.CENTER);
        //
        HBox hboxClean = new HBox(buttonBack, buttonCleanup);
        hboxClean.setSpacing(62);
        hboxClean.setAlignment(Pos.CENTER);
        //
        VBox vbox = new VBox(hboxTop, hboxText, hboxClean, hbox123p, hbox0);
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.TOP_CENTER);
        //
        Scene scene = new Scene(vbox, 170, 200);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        */
        //
        /*
        Label label = new Label("0");
        //
        TextField textField = new TextField("0");
        textField.setMaxWidth(200);
        textField.setAlignment(Pos.TOP_RIGHT);
        textField.setEditable(false);
        //
        Button button0 = new Button("0");
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        //
        Button button1 = new Button("1");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        //
        Button button2 = new Button("2");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        //
        Button button3 = new Button("3");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        //
        Button buttonPlus = new Button("+");
        buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                label.setText(textField.getText());
                textField.setText("0");
            }
        });
        //
        Button buttonEquals = new Button("=");
        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                long val1 = Long.valueOf(label.getText());
                long val2 = Long.valueOf(textField.getText());
                textField.setText(String.valueOf(val1 + val2));
                label.setText("0");
            }
        });
        //
        Button buttonCleanup = new Button("C");
        buttonCleanup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                label.setText("0");
                textField.setText("0");
            }
        });
        //
        Button buttonBack = new Button("<");
        buttonBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int len = textField.getText().length();
                if (len > 1) {
                    textField.setText(textField.getText().substring(0, len - 1));
                }
            }
        });
        //
        HBox hboxTop = new HBox(label);
        hboxTop.setAlignment(Pos.CENTER);
        //
        HBox hboxText = new HBox(textField);
        hboxText.setAlignment(Pos.CENTER);


        //
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(4);
        gridPane.setVgap(4);
        gridPane.setPadding(new Insets(0, 10, 0, 10));
        gridPane.add(button1, 0, 0, 5, 5);
        gridPane.add(button2, 1, 0, 5, 5);
        gridPane.add(button3, 2, 0, 5, 5);
        //
        Group root = new Group();
        root.getChildren().add(gridPane);
        Scene scene = new Scene(root, 400, 250, Color.WHITE);

        //
        HBox hbox123p = new HBox(button1, button2, button3, buttonPlus);
        hbox123p.setSpacing(5);
        hbox123p.setAlignment(Pos.CENTER);
        //
        HBox hbox0 = new HBox(button0, buttonEquals);
        hbox0.setSpacing(62);
        hbox0.setAlignment(Pos.CENTER);
        //
        HBox hboxClean = new HBox(buttonBack, buttonCleanup);
        hboxClean.setSpacing(62);
        hboxClean.setAlignment(Pos.CENTER);
        //

        //
        //VBox vbox = new VBox(hboxTop, hboxText, hboxClean, hbox123p, hbox0);
        //VBox vbox = new VBox(hboxTop, hboxText, gridPane);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(gridPane);
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.TOP_CENTER);
        //
        //Scene scene = new Scene(vbox, 170, 200);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        */
        //
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}
