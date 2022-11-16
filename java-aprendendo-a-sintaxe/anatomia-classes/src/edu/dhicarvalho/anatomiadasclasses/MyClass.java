package edu.dhicarvalho.anatomiadasclasses;

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
