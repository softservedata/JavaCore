package com.edu;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcController {

    @FXML
    private TextField digits;

    public void button1Clicked() {
        digits.setText(digits.getText() + "1");
        System.out.println("Button1 clicked!");
    }

    public void button2Clicked() {
        digits.setText(digits.getText() + "2");
        System.out.println("Button2 clicked!");
    }

    public void button3Clicked() {
        digits.setText(digits.getText() + "3");
        System.out.println("Button3 clicked!");
    }

    public void buttonPClicked() {
        System.out.println("Button+ clicked!");
    }
}
