package com.chemasmas.uamasesoratemvn;

import com.chemasmas.uamasesoratemvn.models.Conexion;
import com.chemasmas.uamasesoratemvn.models.TroncosDTO;
import com.chemasmas.uamasesoratemvn.models.TroncosDAO;
import io.github.cdimascio.dotenv.Dotenv;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Dotenv dotenv = Dotenv.load();
        label.setText(dotenv.get("msj"));
        
        TroncosDTO tronco = new TroncosDTO();
        tronco.setNombre("Tronco 1");
        
        TroncosDAO tdba= new TroncosDAO();

        System.out.println(tdba.create(tronco));
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
