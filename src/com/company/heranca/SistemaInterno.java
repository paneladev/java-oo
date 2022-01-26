package com.company.heranca;

public class SistemaInterno {

    public boolean autentica(Autenticavel func, int senha) {

        if(func.autentica(senha)) {
            System.out.println("Usuario logado");
            return true;
        } else {
            System.out.println("Usuario não logado, problema na autenticação");
            return false;
        }


    }

}
