package edu.dhicarvalho.desafios;

import java.util.*;

public class BuscaSequencial {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

    System.out.println("Defina um número: ");
    int numero = leitor.nextInt();
    int posicao = 0;

    boolean achou = false;
    for (int i = 0; i < elementos.length; i++) {
      if (elementos[i] == numero) {
        achou = true;
        posicao = i;
        break;
      }
    }
    if (achou) {
      System.out.println("Achei " + numero + " na posicao " + posicao);
    } else {
      System.out.println("Numero " + numero + " nao encontrado!");
    }

  }
}
