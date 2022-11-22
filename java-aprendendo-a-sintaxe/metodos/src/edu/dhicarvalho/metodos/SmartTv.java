package edu.dhicarvalho.metodos;

/**
 * Esta classe foi criada para simular o funcionamento de uma Smart TV e suas
 * funções básicas.
 * 
 * @author Dhi Carvalho.
 * @since 18/11/2022
 */

public class SmartTv {
  /*
   * Declaração inicial das variáveis.
   */

  boolean on = false;
  int channel = 1;
  int volume = 25;

  /*
   * Método para ligar a Smart TV.
   */

  public void turnOn() {
    on = true;
  }

  /*
   * Método para desligar a Smart TV.
   */

  public void toSwitchOff() {
    on = false;
  }

  /*
   * Método para aumentar o volume da Smart TV.
   */

  public void turnUpTheVolume() {
    System.out.println("Volume Atual: " + volume);
    volume++;
    System.out.println("Novo Volume: " + volume);
  }

  /*
   * Método para diminuir o volume da Smart TV.
   */

  public void lowerTheVolume() {
    System.out.println("Volume Atual: " + volume);
    volume--;
    System.out.println("Novo Volume: " + volume);
  }

  /*
   * Métodos para mudar de Smart TV.
   */

  public void increaseChannel() {
    System.out.println("Canal Atual: " + channel);
    channel++;
    System.out.println("Novo Canal: " + channel);
  }

  public void shrinkChannel() {
    System.out.println("Canal Atual: " + channel);
    channel--;
    System.out.println("Novo Canal: " + channel);
  }

  public void changeChannel(int newChannel) {
    System.out.println("Canal Atual: " + channel);
    channel = newChannel;
    System.out.println("Novo Canal: " + channel);
  }
}
