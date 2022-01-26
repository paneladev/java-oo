package com.company.abstracao;

public class App {
    public static void main(String[] args) {

        // esse codigo nao funciona, uma classe abstrata não pode ser instanciada
        //Veiculo veiculo = new Veiculo();


        // realizo a instância de um novo Carro que é filho de Veiculo, assim tenho acesso aos atributos da classe pai
        Carro novoCarro = new Carro();
        novoCarro.setMarca("Hyundai");
        novoCarro.setModelo("HB29");
        novoCarro.setCombustivel("Gasolina");
        novoCarro.setNumeroRodas(4);
        novoCarro.setAno(2019L);

    }
}
