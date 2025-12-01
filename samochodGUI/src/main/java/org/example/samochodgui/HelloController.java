package org.example.samochodgui;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import symulator.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable  {




    @FXML
    public ComboBox<Samochód> samochodComboBox;
    public Button silnikwlButton;
    public Button silnikwylButton;
    public Button zwiekszbiegButton;
    public Button zmniejszbiegButton;
    public Button dodajgazButton;
    public Button odejmijgazButton;
    public Button wcisnijsprzegloButton;
    public Button zwolnijsprzegloButton;
    public TextField modelTextField;
    public TextField nrRejTextField;
    public TextField wagaSamochodTextField;
    public TextField predkoscTextField;
    public ImageView carImageView;
    public Button dodajnowyButton;

    @FXML
    private Label welcomeText;


    Sprzęgło sprzęgło1 = new Sprzęgło("Fiat", "125p", 1980,"sprzęgło", 30, 20);
    SkrzyniaBiegów skrzynia1 = new SkrzyniaBiegów("Opel", "Astra", 2003, "skrzynia",300, 1200, 5, sprzęgło1);
    Silnik silnik1 = new Silnik("Volkswagen", "Passat", 2001, "silnik", 500, 4000, 9000);
    Pozycja pozycja = new Pozycja();
    Samochód fura = new Samochód(skrzynia1, silnik1, pozycja, "Passat", "KRA33333", 3, 100);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        samochodComboBox.getItems().add(fura);
        System.out.println("HelloController initialized");
        Image carImage = new Image(getClass().getResource("/images/car.png").toExternalForm());
        System.out.println("Image width: " + carImage.getWidth() + ", height: " + carImage.getHeight());
        carImageView.setImage(carImage);
        carImageView.setFitWidth(30);
        carImageView.setFitHeight(20);
        carImageView.setTranslateX(0);
        carImageView.setTranslateY(0);
    }


    void refresh() {
        modelTextField.setText(fura.model);
        nrRejTextField.setText(fura.nrrej);
        wagaSamochodTextField.setText(String.valueOf(fura.waga));
        predkoscTextField.setText(String.valueOf(fura.predkosc));
    }



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void silnikwlButton(){
        fura.włącz();
        System.out.println("Włączyłeś samochód");
        refresh();

    }
    @FXML
    public void silnikwylButton(){
        fura.wyłącz();
        System.out.println("Wyłączyłeś samochód");
        refresh();

    }
    @FXML
    public void zwiekszbiegButton(){
        fura.skrzynia.zwiększBieg();
        System.out.println("Zwiększyłeś bieg");
        refresh();

    }
    @FXML
    public void zmniejszbiegButton(){
        fura.skrzynia.zmniejszBieg();
        System.out.println("Zmniejszyłeś bieg");
        refresh();

    }
    @FXML
    public void samochódComboBox(){
        Samochód wybrany = samochodComboBox.getSelectionModel().getSelectedItem();
        refresh();

    }

    public void openAddCarWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DodajSamochod.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Dodaj nowy samochód");
        stage.show();

    }



}

