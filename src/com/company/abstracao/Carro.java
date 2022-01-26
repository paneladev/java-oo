package com.company.abstracao;

// classe Carro que extende Veiculo
// deste modo já tem acesso aos atributos da classe pai
public class Carro extends Veiculo {

    private String combustivel;

    // metodo implementado da classe Pai Veiculo
    @Override
    public String alimentacao() {
        return combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
