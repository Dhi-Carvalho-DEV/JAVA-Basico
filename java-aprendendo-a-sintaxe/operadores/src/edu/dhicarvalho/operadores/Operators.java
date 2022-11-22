package edu.dhicarvalho.operadores;

/**
 * 
 * Esta classe foi criada para exemplificar como podemos utilizar os operadores.
 * 
 * @author Dhi Carvalho
 * @since 18/11/2022
 */

public class Operators {
    public static void main(String[] args) throws Exception {
        // Concatenação
        String fullName = "LINGUAGEM" + " " + "JAVA";

        System.out.println(fullName);

        String concatenation = "?";

        concatenation = 1 + 1 + 1 + "1";
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + 1;
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + "1";
        System.out.println(concatenation);

        concatenation = "1" + 1 + 1 + 1;
        System.out.println(concatenation);

        concatenation = "1" + (1 + 1 + 1);
        System.out.println(concatenation);

        // Unários
        int number = 5;

        number = -number;
        System.out.println(number);

        number = number * -1;
        System.out.println(number);

        // Incrementação e Decrementação
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);

        System.out.println(number--);
        System.out.println(number);
        System.out.println(--number);

        // Negação
        boolean variable = true;

        System.out.println(variable);
        variable = !variable;
        System.out.println(variable);

        // Ternário

        int a, b;

        a = 6;
        b = 6;

        // String result = "";
        // if (a == b) {
        // result = "verdadeiro";
        // } else {
        // result = "falso";
        // }

        String result = a == b ? "verdadeiro" : "falso";

        System.out.println(result);

        // Relacionais

        int number1 = 1;
        int number2 = 2;
        boolean yesNo = number1 == number2;

        System.out.println("Numero 1 é igual ao numero 2? " + yesNo);

        yesNo = number1 != number2;
        System.out.println("Numero 1 é igual ao numero 2? " + yesNo);

        if (number1 > number2) {
            System.out.println("Numero 1 maior que nummero 2");
        }

        if (number1 < number2) {
            System.out.println("Numero 1 menor que numero 2");
        }

        String nameOne = "Diogo";
        String nameTwo = "Diogo";

        System.out.println(nameOne == nameTwo);

        String nameTree = new String("Diogo");
        System.out.println(nameOne == nameTree);
        System.out.println(nameOne.equals(nameTree));

        // Lógicos

        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println("As duas são verdadeiras");
        } else {
            System.out.println("fim");
        }

        if (condition1 || condition2) {
            System.out.println("Uma das condições é verdadeira");
        }

        if (condition1 && (7 > 4)) {
            System.out.println("As duas são verdadeiras");
        } else {
            System.out.println("fim");
        }

        if (condition2 || (7 < 4)) {
            System.out.println("Ambas são falsas");
        } else {
            System.out.println("fim");
        }
    }
}
