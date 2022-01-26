package com.company.heranca;

public class Cliente implements Autenticavel {

    private String nome;
    private String sobreNome;

    public String getNomeCompleto() {
        return nome.concat(" ").concat(sobreNome);
    }

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

    @Override
    public boolean autentica(int senha) {
        // implementaria de alguma forma esse metodo aqui
        return true;
    }
}
