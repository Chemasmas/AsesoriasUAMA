package com.chemasmas.uamasesoratemvn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jack
 */
public class ContactoController implements Initializable {

    @FXML
    private TextField nombreAlumno;
    @FXML
    private TextField matriculaAlumno;
    @FXML
    private TextField correoAlumno;
    @FXML
    private Button enviar;
    @FXML
    private Button volverDetalles;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void enviarAsesoria(ActionEvent event) throws IOException {
        Parent homePage;
        homePage = FXMLLoader.load(getClass().getResource("/fxml/MensajeConfirmacion.fxml"));
        Scene homePageScene = new Scene(homePage);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();
        
    }

    @FXML
    private void volverDetalles(ActionEvent event) throws IOException {
        Parent homePage;
        homePage = FXMLLoader.load(getClass().getResource("/fxml/DetallesAsesoria.fxml"));
        Scene homePageScene = new Scene(homePage);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

    }

}
