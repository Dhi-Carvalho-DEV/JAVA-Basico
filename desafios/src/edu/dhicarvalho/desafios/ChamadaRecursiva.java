package edu.dhicarvalho.desafios;

import java.util.*;

public class ChamadaRecursiva {
  public static void main(String[] args) {

    Scanner numero = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int N = numero.nextInt();
    System.out.println(somatorio(N));
  }

  /**
   * Método útil que calcula o somatório de um número usando recursividade.
   */
  static int somatorio(int numero) {
    if (numero == 0) {
      return 0;
    } else {
      return numero + somatorio(numero - 1);
    }
  }
}
