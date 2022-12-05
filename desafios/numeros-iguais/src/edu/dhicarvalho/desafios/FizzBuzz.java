package edu.dhicarvalho.desafios;

import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = number.nextInt();

    // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o
    // enunciado.
    if (((num % 3) == 0) && ((num % 5) == 0)) {
      System.out.println("FizzBuzz");
    } else if ((num % 3) == 0) {
      System.out.println("Fizz");
    } else if ((num % 5) == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(num);
    }
  }
}
