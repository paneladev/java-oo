package com.company.heranca;

public class Sistema {

    private String[] valores = new String[50];

    public String getValorByIndice(int indice) throws ValorIncorretoException {

        if(indice >= 0 && indice < valores.length) {
            return valores[indice];
        }

        throw new ValorIncorretoException("Valor incorreto para o indice");
    }

    public static void main(String[] args) {

        Sistema sistema = new Sistema();


        try {

            String valorByIndice = sistema.getValorByIndice(50);
            System.out.println(valorByIndice);


        } catch (ValorIncorretoException e) {
            System.out.println(e);
        }
    }

}
