package edu.dhicarvalho.tiposevariaveis;

/**
 * Esta classe foi criada para demonstração dos tipos de variáveis que podemos
 * ter em uma classe.
 * 
 * @author Dhi Carvalho
 * 
 * @since 16/11/2022
 */

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte age = 123;
        short year = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double wage = 1275.33;

        System.out.println(age);
        System.out.println(year);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(wage);

        short shortNumber = 1;
        int regularNumber = shortNumber;
        short shortNumber2 = (short) regularNumber;

        System.out.println(shortNumber2);

        int number = 5;
        number = 10;

        System.out.println(number);

        double VALUE_OF_PI = 3.14;
        VALUE_OF_PI = 10.75;

        System.out.println(VALUE_OF_PI);

        final double VALUE_OF_PI2 = 3.14;

        System.out.println(VALUE_OF_PI2);
    }
}
