public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    System.out.println("Volume Atual: " + volume);
    volume++;
    System.out.println("Novo Volume: " + volume);
  }

  public void diminuirVolume() {
    System.out.println("Volume Atual: " + volume);
    volume--;
    System.out.println("Novo Volume: " + volume);
  }

  public void aumentarCanal() {
    System.out.println("Canal Atual: " + canal);
    canal++;
    System.out.println("Novo Canal: " + canal);
  }

  public void diminuirCanal() {
    System.out.println("Canal Atual: " + canal);
    canal--;
    System.out.println("Novo Canal: " + canal);
  }

  public void mudarCanal(int novoCanal) {
    System.out.println("Canal Atual: " + canal);
    canal = novoCanal;
    System.out.println("Novo Canal: " + canal);
  }
}
