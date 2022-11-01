package com.edu;

import com.google.gson.Gson;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import okhttp3.*;

import java.io.IOException;

public class ContactsController {

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;

    @FXML
    private ListView<String> listView;

    private Gson gson;

    private OkHttpClient client;

    public ContactsController() {
        gson = new Gson();
        client = new OkHttpClient();
    }

    public void buttonAddClicked() throws IOException {
        System.out.println("buttonAddClicked clicked!");
        ContactDto contactDto = new ContactDto(firstname.getText(), lastname.getText(), email.getText(), phone.getText());
        //
        String requestJson = gson.toJson(contactDto);
        System.out.println("requestJson = " + requestJson);
        //
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody formBody = RequestBody.create(requestJson, JSON);
        Request request = new Request
                .Builder()
                .url("http://localhost:8080/contacts")
                .post(formBody)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println("Response Code = " + response.code());
        String resultJson = response.body().string();
        contactDto = gson.fromJson(resultJson, ContactDto.class);
        System.out.println("response; contactDto = " + contactDto);
        //
    }

    public void buttonGetListClicked() throws IOException {
        //
        final ObservableList<String> list = FXCollections.observableArrayList("A111","B222","C333");
        listView.setItems(list);
//        final ListView<String> listView = new ListView<String>(list);
//        listView.setPrefWidth(150);
//        listView.setPrefHeight(550);
//        listView.setLayoutX(35);
//        listView.setLayoutY(230);
    }
}
