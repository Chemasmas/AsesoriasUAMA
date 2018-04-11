package com.chemasmas.uamasesoratemvn;

import com.chemasmas.uamasesoratemvn.models.Divisiones;
import com.chemasmas.uamasesoratemvn.models.HibernateUtil;
import com.chemasmas.uamasesoratemvn.models.Troncos;
import com.chemasmas.uamasesoratemvn.models.Ueas;
import io.github.cdimascio.dotenv.Dotenv;
import java.net.URL;
import java.util.List;
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
import org.hibernate.Session;
import org.hibernate.criterion.Property;

public class FXMLController implements Initializable {
    
    static Session session;
    private Divisiones division;
    private Troncos tronco;
    
    @FXML
    private Label label;
    @FXML
    private TextField nombreUea;
    @FXML
    private Button buscar;
    @FXML
    private TableView<?> resulatdosAsesoria;
    @FXML
    private TableColumn<?, ?> nombreProfesor;
    @FXML
    private TableColumn<?, ?> uea;
    @FXML
    private TableColumn<?, ?> lugarAsesoria;
    @FXML
    private TableColumn<?, ?> horraio;
    @FXML
    private ComboBox<Divisiones> divisionCB;
    @FXML
    private ComboBox<Troncos> troncoCB;
    @FXML
    private ComboBox<Ueas> ueaCB;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Dotenv dotenv = Dotenv.load();
        label.setText(dotenv.get("msj"));   
    }
    
    @FXML
    private void setDivision(ActionEvent event) {
        
        division= this.divisionCB.getSelectionModel().getSelectedItem();
        
    }
    
    @FXML
    private void setTronco(ActionEvent event) {
        tronco = this.troncoCB.getSelectionModel().getSelectedItem();
        
        List<Ueas> lUeas = session.createCriteria(Ueas.class)
                .add( Property.forName("divisiones").eq(this.division) )
                .list();
        ueaCB.getItems().addAll(lUeas);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        session = HibernateUtil.getSessionFactory().openSession();
        
        List<Divisiones> lDiv = session.createCriteria(Divisiones.class).list();
        divisionCB.getItems().addAll(lDiv);
        
        List<Troncos> lTro = session.createCriteria(Troncos.class).list();
        troncoCB.getItems().addAll(lTro);
        
        //List<Ueas> lUeas = session.createCriteria(Ueas.class).list();
        //ueaCB.getItems().addAll(lUeas);
    }    

    @FXML
    private void buscarPorNombre(ActionEvent event) {
    }

    @FXML
    private void agendar(ActionEvent event) {
    }
}
