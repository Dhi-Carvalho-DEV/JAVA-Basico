package edu.dhicarvalho.anatomiadasclasses;

/**
 * Esta classe foi criada durante o curso de JAVA Básico da DIO e
 * tem como objetivo demonstrar o aprendizado sobre a criação de uma
 * classe, declaração de variáveis e declarção de parâmetros.
 * 
 * @author Dhi Carvalho
 * @since 16/11/2022
 * 
 */

public class MyClass {
  public static void main(String[] args) {
    String myName = "Diogo";
    int yearBirth = 1986;
    boolean married = false;

    System.out.println(yearBirth);

    yearBirth = 1985;

    System.out.println(myName);
    System.out.println(yearBirth);
    System.out.println(married);

    String firstName = "Diogo";
    String secondName = "Santana";

    String fullName = fullName(firstName, secondName);
    System.out.println(fullName);

  }

  public static String fullName(String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
  }
}
