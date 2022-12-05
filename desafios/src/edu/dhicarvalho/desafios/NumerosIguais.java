package edu.dhicarvalho.desafios;

import java.util.*;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Numero: ");
        int A = leitor.nextInt();
        System.out.print("Numero: ");
        int B = leitor.nextInt();

        if (A == B) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}
