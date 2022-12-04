package edu.dhicarvalho.estruturasderepeticao;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

public class ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantNumeros;
    int numero;
    int quantPares = 0;
    int quantImpares = 0;

    int count = 0;

    System.out.println("Quantidade de números: ");
    quantNumeros = scan.nextInt();

    do {
      System.out.println("Número: ");
      numero = scan.nextInt();
      count++;

      if (numero % 2 == 0)
        quantPares++;
      else
        quantImpares++;

    } while (count < quantNumeros);

    System.out.println("Quuantidade de Pares: " + quantPares);
    System.out.println("Quuantidade de Ímpares: " + quantImpares);
  }
}
