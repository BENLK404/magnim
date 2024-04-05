package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.StringConverter;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private AnchorPane affiche_pane;
    @FXML
    private AnchorPane home;
    @FXML
    private AnchorPane depot_affiche;
    @FXML
    private AnchorPane paypal_menu;
    @FXML
    private AnchorPane paypal_icon;
    @FXML
    void OpenCaisse() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("/interfaces/homeCaisse.fxml"));
            affiche_pane.getChildren().removeAll();
            affiche_pane.getChildren().setAll(fxml);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @FXML
    void OpenDashboard() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("/interfaces/home.fxml"));
            home.getChildren().removeAll();
            home.getChildren().setAll(fxml);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    void OpenMessage() {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("/interfaces/homeMessage.fxml"));
            affiche_pane.getChildren().removeAll();
            affiche_pane.getChildren().setAll(fxml);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    @FXML
    void OpenMenu(){
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("/interfaces/homeMenu.fxml"));
            affiche_pane.getChildren().removeAll();
            affiche_pane.getChildren().setAll(fxml);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    @FXML
    void openDepot(){
        depot_affiche.setVisible(true);

    }
    @FXML
    void OpenPaypalMenu(){
        paypal_menu.setVisible(true);

    }
    @FXML
    void Back(){
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}