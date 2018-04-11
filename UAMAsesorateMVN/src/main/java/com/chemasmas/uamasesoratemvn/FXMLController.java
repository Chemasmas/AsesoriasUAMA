package com.chemasmas.uamasesoratemvn;

import io.github.cdimascio.dotenv.Dotenv;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nombreUea;
    @FXML
    private TableView<?> resulatdosAsesoria;
    @FXML
    private TableColumn<?, ?> nombreProfesor;
    @FXML
    private TableColumn<?, ?> uea;
    @FXML
    private TableColumn<?, ?> lugarAsesoria;
    @FXML
    private ComboBox<?> divisionCB;
    @FXML
    private ComboBox<?> troncoCB;
    @FXML
    private ComboBox<?> ueaCB;
    @FXML
    private TableColumn<?, ?> horario;
    @FXML
    private Button buscarNombre;
    @FXML
    private Button agendar;
    @FXML
    private Button buscarDTN;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Dotenv dotenv = Dotenv.load();
        label.setText(dotenv.get("msj"));   
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void buscarPorNombre(ActionEvent event) {
    }

    @FXML
    private void agendar(ActionEvent event) {
    }

    @FXML
    private void buscarPorDTU(ActionEvent event) {
    }
}
