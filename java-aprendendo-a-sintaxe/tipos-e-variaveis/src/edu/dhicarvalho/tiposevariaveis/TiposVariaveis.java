package edu.dhicarvalho.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;

        System.out.println(VALOR_DE_PI);

        final double VALOR_DE_PI2 = 3.14;

        System.out.println(VALOR_DE_PI2);
    }
}
