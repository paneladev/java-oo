package com.company.heranca;

//classe abstrata, esta classe não pode ser instanciada, ele serve apenas de referência para as classes filhas
public abstract class Funcionario {

    private String nome;
    private String sobreNome;
    private String cpf;
    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    //metodo abstrato que deve ser implementado pelos filhos desta classe
    public abstract String getNomeCargo();

    public String getNomeCompleto() {
        return this.nome + " " + this.sobreNome;
    }

    /*
        GETTER's and SETTER's
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
