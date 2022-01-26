package com.company.abstracao;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private int numeroRodas;
    private Long ano;

    //gasolina, eletrico, hidrogenio, tração humana
    public abstract String alimentacao();

    /*
        GETTER's e SETTER's
     */

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }
}