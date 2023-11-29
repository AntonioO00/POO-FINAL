package Controladores;

import Aplicativo.Main;
import Equipamentos.Aplicacao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorRelatorio implements Initializable {

    @FXML
    private Label LabelRelatorio;

    @FXML
    protected void botaoVoltaRealatorio(ActionEvent e){
        Main.changeScreen("main");
    }

   /*public void mostraRelatorio(){
       LabelRelatorio.setText(ControladorEquipes.mostraEquipes());
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mostraRelatorio();
    }
}
