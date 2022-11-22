package edu.dhicarvalho.anatomiadasclasses;

/**
 * Esta classe foi criada durante o curso de JAVA Básico da DIO e
 * tem como objetivo demonstrar o aprendizado sobre a criação de um
 * programa para verificar a média de um aluno e informar se ele foi
 * Reprovado, se irá fazer a Prova de Minerva ou foi Aprovado.
 * 
 * @author Dhi Carvalho
 * @since 16/11/2022
 * 
 */

public class StudentBulletin {
  public static void main(String[] args) {
    int finalMedia = 6;

    /*
     * Utilização da condicionais if/ else para verificar a média do aluno.
     */

    if (finalMedia < 6) {
      System.out.println("REPROVADO");
    } else if (finalMedia == 6) {
      System.out.println("PROVA MINERVA");
    } else {
      System.out.println("APROVADO");
    }

  }
}
