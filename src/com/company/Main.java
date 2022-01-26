package com.company;

import com.company.heranca.*;

public class Main {



    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        //cliente.setNome("Fulano");
        //cliente.setSobreNome(" de tal");
        String nomeCompleto;
        System.out.println("INICIO SISTEMA");

        try{

            //nomeCompleto = cliente.getNomeCompleto();

            int total = 10 / 0;


        } catch (NullPointerException e) {
            System.out.println(e);
            nomeCompleto = "ocorreu uma exception de NullPointer";
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("ocoreu um erro de calculo");
        }

        //System.out.println(nomeCompleto);

        System.out.println("FIM DO SISTEMA");
    }

    public static void imprimeNomeCargo(Funcionario func) {
        System.out.println(func.getNomeCargo());

        if (func instanceof Dev) {
            Dev dev = (Dev) func;
            System.out.println(dev.getLinguagem());
        } else if (func instanceof Gerente) {
            Gerente gerente = (Gerente) func;
            System.out.println(gerente.getNumeroDeFuncionariosGerenciados());
        }

    }


}