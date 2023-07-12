package MateriInterface;

import MateriInterface.interfaces.Phone;

public class Xiaomi implements Phone {
  private int volume;
  private boolean isPowerOn;

  public Xiaomi() {
    this.volume = 50;
  }

  @Override
  public void powerOn() {
    this.isPowerOn = true;
    System.out.println("Handphone menyala...");
    System.out.println("Selamat datang di Xiaomi");
    System.out.println("Android version 10");
  }

  @Override
  public void powerOff() {
    this.isPowerOn = false;
    System.out.println("Mematikan Handphone");
  }

  @Override
  public void volumeUp() {
    if (this.isPowerOn) {
      if (this.volume == MAX_VOLUME) {
        System.out.println("Volume Sudah Maksimal!!!");
        System.out.println("Volume = " + this.volume + "%");
      } else {
        this.volume += 10;
        System.out.println("Volume sekarang: " + this.volume + "%");
      }
    } else {
      System.out.println("Handphone mati, silahkan nyalakan dulu!!");
    }
  }

  @Override
  public void volumeDown() {
    if (this.isPowerOn) {
      if (this.volume == MIN_VOLUME) {
        System.out.println("Volume Sudah Minimum!!!");
        System.out.println("Volume = " + this.volume + "%");
      } else {
        this.volume -= 10;
        System.out.println("Volume sekarang: " + this.volume + "%");
      }
    } else {
      System.out.println("Handphone mati, silahkan nyalakan dulu!!");
    }
  }

  public int getVolume() {
    return this.volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isPowerOn() {
    return this.isPowerOn;
  }

  public void setPowerOn(boolean isPowerOn) {
    this.isPowerOn = isPowerOn;
  }
}
