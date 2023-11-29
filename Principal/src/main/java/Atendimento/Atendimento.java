package Atendimento;

import Aplicativo.Main;
import Equipes.Equipe;
import javafx.event.ActionEvent;

public class Atendimento {

    private int codigo;
    private String dataInicio;
    private int duracao;
    private String status;
    private Equipe equipe;
    //private Evento evento;
    public int getCodigo() {
        return codigo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getStatus() {
        return status;
    }

    public void setEquipe(Equipe team) {
        equipe = team;
    }

    public Atendimento(int codigo, String dataInicio, int duracao, String status, Equipe equipe){
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.duracao = duracao;
        this.status = status;
        this.equipe = equipe;
        //this.evento = evento;
        status = "Pendente";
        equipe = null;
    }

    protected void botaoInicialVoltarEquipamento(ActionEvent e){
        Main.changeScreen("equipamento");
    }
}

  //  public double calculaCusto(){
    //    double custoEquipe = duracao*250*equipe.getQuantidade();

    //}
