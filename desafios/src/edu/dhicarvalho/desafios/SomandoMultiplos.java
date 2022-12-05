package edu.dhicarvalho.desafios;

import java.util.*;

public class SomandoMultiplos {
  public static void main(String[] args) {
    int A, N;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    A = input.nextInt();
    System.out.print("Digite o limite para o somatório: ");
    N = input.nextInt();

    int m = N / A;
    int soma = m * (m + 1) / 2;

    int somaMultiplos = A * soma;

    System.out.println(somaMultiplos);
  }
}
