/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn;

import com.chemasmas.uamasesoratemvn.models.ProfesoresHasUeas;
import com.chemasmas.uamasesoratemvn.models.ProfesoresHasUeasMTV;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author eva_0
 */
public class DetallesAsesoriaController implements Initializable {

    @FXML
    private Label nombreProfesor;
    @FXML
    private Label telProfesor;
    @FXML
    private Label correoProfesor;
    @FXML
    private Label nombreUEA;
    @FXML
    private Label claveUea;
    @FXML
    private Label horaInicio;
    @FXML
    private Label horaFin;
    private ProfesoresHasUeasMTV selected;
    private ProfesoresHasUeas detalles;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volverABuscarAsesoria(ActionEvent event) throws IOException {
        Parent homePage;
        homePage = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        Scene homePageScene = new Scene(homePage);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();
    }

    @FXML
    private void confirmarAsesoria(ActionEvent event) throws IOException {
        Parent homePage;
        homePage = FXMLLoader.load(getClass().getResource("/fxml/Contacto.fxml"));
        Scene homePageScene = new Scene(homePage);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();
    }

    void setSelected(ProfesoresHasUeasMTV selected) {
        this.selected = selected;
        this.detalles = selected.getMe();
        System.out.println(this.selected.getMe());
        
        this.nombreProfesor.setText(detalles.getProfesores().getNombre());
        this.telProfesor.setText(detalles.getProfesores().getTelefono());
        this.correoProfesor.setText(detalles.getProfesores().getCorreo());
        this.nombreUEA.setText(detalles.getUeas().getNombre());
        this.claveUea.setText(detalles.getUeas().getClave());
        
        this.horaInicio.setText(detalles.getInicio().toString());
        this.horaFin.setText(detalles.getFin().toString());
    }
    
}
