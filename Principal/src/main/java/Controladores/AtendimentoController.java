package Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AtendimentoController {
    @FXML
    private Button botaoCiclone;
    @FXML
    private Button botaoSeca;
    @FXML
    private Button botaoTerremoto;
    @FXML
    private TextField codAtend;
    @FXML
    private TextField datInicio;
    @FXML
    private TextField duracao;
    @FXML
    private TextField textRecebe;
    @FXML
    private TextField textRecebe2;
    @FXML
    private Button cadAtendimento;

    @FXML
    public void setVisibleTerremoto() {

        textRecebe2.setVisible(true);
        textRecebe2.setPromptText("Magnitude");
        codAtend.setVisible(true);
        datInicio.setVisible(true);
        duracao.setVisible(true);
        cadAtendimento.setVisible(true);
    }

    @FXML
    public void setVisibleCiclone() {
        textRecebe.setVisible(true);
        textRecebe.setPromptText("Velocidade");
        textRecebe2.setVisible(true);
        textRecebe2.setPromptText("precipitação");
        codAtend.setVisible(true);
        datInicio.setVisible(true);
        duracao.setVisible(true);
        cadAtendimento.setVisible(true);
    }

    @FXML
    public void setVisibleSeca() {

        textRecebe2.setVisible(true);
        textRecebe2.setPromptText("Estiagem");
        codAtend.setVisible(true);
        datInicio.setVisible(true);
        duracao.setVisible(true);
        cadAtendimento.setVisible(true);
    }


    public void cadAtend(ActionEvent actionEvent) {

    }
}