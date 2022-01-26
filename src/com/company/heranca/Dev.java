package com.company.heranca;

public class Dev extends Funcionario {

    private String linguagem;

    public Dev(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    /*
        GETTER`s and SETTER`s
     */
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String getNomeCargo() {
        return "Dev";
    }
}
