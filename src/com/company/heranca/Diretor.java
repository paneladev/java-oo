package com.company.heranca;

public class Diretor extends Funcionario implements Autenticavel {

    private int senha;

    public Diretor(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    @Override
    public String getNomeCargo() {
        return "Diretor";
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }



    /*
        GETTER`s and SETTER`s
     */
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
