package com.example.diego.myapplication;

/**
 * Created by Diego on 02/09/2015.
 */
public class Voo {

    private int codigo;
    private String origem;
    private String destino;
    private String dataPartida;

    public Voo(){}

    public Voo(int codigo, String origem, String destino, String dataPartida) {
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }
}
