package com.company.encapsulamento;

public class CarteiraEstudantil {

    //atributos da classe
    private String nome;
    private String sobreNome;
    private int idade;
    private boolean ativo;

    // construtor default sem nenhum atributo
    public CarteiraEstudantil(){ }

    //construtor criado com todos os atributos
    public CarteiraEstudantil(String nome, String sobreNome, int idade, boolean ativo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.ativo = ativo;
    }

    //construtor criado com parte dos atributos
    public CarteiraEstudantil(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    /*
        Metodos GETTER's e SETTER's
        para acesso aos atributos da classe
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
