package edu.dhicarvalho.metodos;

/**
 * Esta classe foi criada para simular o usuário utilizando a Smart TV e suas
 * funções básicas.
 * 
 * @author Dhi Carvalho.
 * @since 18/11/2022
 */

public class UserSmartTv {
  public static void main(String[] args) {
    /*
     * Criação do objeto SmartTv.
     */

    SmartTv smartTv = new SmartTv();

    /*
     * Utilizzação dos métodos criados na classe SmartTv.
     */

    System.out.println("TV Ligada? " + smartTv.on);
    System.out.println("Canal Atual: " + smartTv.channel);
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.turnOn();
    System.out.println("Novo Status -> TV Ligada? " + smartTv.on);

    smartTv.toSwitchOff();
    System.out.println("Novo Status -> TV Ligada? " + smartTv.on);

    smartTv.turnUpTheVolume();
    smartTv.turnUpTheVolume();

    smartTv.lowerTheVolume();
    smartTv.lowerTheVolume();
    smartTv.lowerTheVolume();
    smartTv.lowerTheVolume();
    smartTv.lowerTheVolume();

    smartTv.increaseChannel();
    smartTv.increaseChannel();

    smartTv.changeChannel(50);

    smartTv.shrinkChannel();
    smartTv.shrinkChannel();
    smartTv.shrinkChannel();
    smartTv.shrinkChannel();
    smartTv.shrinkChannel();
    smartTv.shrinkChannel();

  }
}
