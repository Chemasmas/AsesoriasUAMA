package com.chemasmas.uamasesoratemvn;

import com.chemasmas.uamasesoratemvn.models.Divisiones;
import com.chemasmas.uamasesoratemvn.models.HibernateUtil;
import com.chemasmas.uamasesoratemvn.models.Profesores;
import com.chemasmas.uamasesoratemvn.models.ProfesoresHasUeas;
import com.chemasmas.uamasesoratemvn.models.ProfesoresHasUeasMTV;
import com.chemasmas.uamasesoratemvn.models.Troncos;
import com.chemasmas.uamasesoratemvn.models.Ueas;
import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

public class FXMLController implements Initializable {

    static Session session;
    private Divisiones division;
    private Troncos tronco;
    private Ueas ueaR;
    private ProfesoresHasUeas PHasU;
    
    @FXML
    private Label label;
    @FXML
    private TextField nombreUea;
    @FXML
    private Button buscar;
    @FXML
    private TableView<ProfesoresHasUeasMTV> resulatdosAsesoria;
    @FXML
    private TableColumn<ProfesoresHasUeasMTV, String> nombreProfesor;
    @FXML
    private TableColumn<ProfesoresHasUeasMTV, String> uea;
    @FXML
    private TableColumn<ProfesoresHasUeasMTV, String> lugarAsesoria;
    @FXML
    private TableColumn<ProfesoresHasUeasMTV, String> horaioInicio;
    @FXML
    private TableColumn<ProfesoresHasUeasMTV, String> horaiofIN;
    @FXML
    private ComboBox<Divisiones> divisionCB;
    @FXML
    private ComboBox<Troncos> troncoCB;
    @FXML
    private ComboBox<Ueas> ueaCB;
    

       
    @FXML
    private void setDivision(ActionEvent event) {
        division= this.divisionCB.getSelectionModel().getSelectedItem();
    }
    
    @FXML
    private void setTronco(ActionEvent event) {
        tronco = this.troncoCB.getSelectionModel().getSelectedItem();
        
        List<Ueas> lUeas = session.createCriteria(Ueas.class)
                .add( Property.forName("divisiones").eq(this.division) )
                .add( Property.forName("troncos").eq(this.tronco) )
                .list();
        
        System.out.println(lUeas);
        
        ueaCB.getItems().clear();
        ueaCB.getItems().addAll(lUeas);

    }
    
    @FXML
    private void setUEA(ActionEvent event) {
        this.ueaR = this.ueaCB.getSelectionModel().getSelectedItem();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        session = HibernateUtil.getSessionFactory().openSession();

        List<Divisiones> lDiv = session.createCriteria(Divisiones.class).list();
        divisionCB.getItems().addAll(lDiv);

        List<Troncos> lTro = session.createCriteria(Troncos.class).list();
        troncoCB.getItems().addAll(lTro);
        
        nombreProfesor.setCellValueFactory(new Callback<CellDataFeatures<ProfesoresHasUeasMTV, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<ProfesoresHasUeasMTV, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return p.getValue().getProfesor();
            }
         });
        
        uea.setCellValueFactory(new Callback<CellDataFeatures<ProfesoresHasUeasMTV, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<ProfesoresHasUeasMTV, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return p.getValue().getUea();
            }
         });
        
        lugarAsesoria.setCellValueFactory(new Callback<CellDataFeatures<ProfesoresHasUeasMTV, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<ProfesoresHasUeasMTV, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return p.getValue().getLugar();
            }
         });
        
        horaioInicio.setCellValueFactory(new Callback<CellDataFeatures<ProfesoresHasUeasMTV, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<ProfesoresHasUeasMTV, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return p.getValue().getInicio();
            }
         });
        
        horaiofIN.setCellValueFactory(new Callback<CellDataFeatures<ProfesoresHasUeasMTV, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<ProfesoresHasUeasMTV, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return p.getValue().getFin();
            }
         });
    }

    @FXML
    private void buscarPorNombre(ActionEvent event) {
        String nombUea = nombreUea.toString();
        System.out.println(nombUea);
        List<Ueas> lista = session.createCriteria(Ueas.class)
                .add( Restrictions.like("nombre", "%"+nombreUea+"%") )
                .list();
        System.out.println(lista);
        
        //resulatdosAsesoria.getItems().clear();
        //resulatdosAsesoria.getItems().addAll(lista);
    }

    @FXML
    private void agendar(ActionEvent event) throws IOException {
   
        ProfesoresHasUeasMTV selected = resulatdosAsesoria.getSelectionModel().getSelectedItem();
        
        System.out.println(selected);
        Parent homePage;
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/DetallesAsesoria.fxml"));
        homePage = loader.load();
        Scene homePageScene = new Scene(homePage);

        DetallesAsesoriaController dac = loader.getController();
        dac.setSelected(selected);
        
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();
    }

    @FXML
    private void buscarPorDTU(ActionEvent event) {
        List<ProfesoresHasUeas> lista = session.createCriteria(ProfesoresHasUeas.class)
                .add( Property.forName("ueas").eq(this.ueaR) )
                .list();
        System.out.println(lista);
        List<ProfesoresHasUeasMTV> listaP = new ArrayList<>();
        
        for (ProfesoresHasUeas registro : lista) {
            listaP.add( new ProfesoresHasUeasMTV(registro) );
        }
        
        
        System.out.println(listaP);
        resulatdosAsesoria.getItems().clear();
        resulatdosAsesoria.getItems().addAll(listaP);
        
    }
    
}
