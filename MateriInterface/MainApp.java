package MateriInterface;

import java.util.Scanner;

import MateriInterface.interfaces.Phone;

public class MainApp {
  public static void main(String[] args) {
    Phone redmiNote10 = new Xiaomi();
    PhoneUser dian = new PhoneUser(redmiNote10);

    dian.turnOnThePhone();

    try (Scanner input = new Scanner(System.in)) {
      String aksi;
      boolean isLooping = true;

      do {
        System.out.println();
        System.out.println("=== APLIKASI INTERFACE ===");
        System.out.println("[1] Nyalakan Handphone");
        System.out.println("[2] Matikan Handphone");
        System.out.println("[3] Perbesar Volume");
        System.out.println("[4] Kecilkan Volume");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------");
        System.out.print("Pilih aksi> ");

        aksi = input.nextLine();

        System.out.println();
        if (aksi.equalsIgnoreCase("1")) {
          dian.turnOnThePhone();
        } else if (aksi.equalsIgnoreCase("2")) {
          dian.turnOffThePhone();
        } else if (aksi.equalsIgnoreCase("3")) {
          dian.makePhoneLouder();
        } else if (aksi.equalsIgnoreCase("4")) {
          dian.makePhoneSilent();
        } else if (aksi.equalsIgnoreCase("0")) {
          isLooping = false;
        } else {
          System.out.println("Kamu memilih aksi yang salah!!!");
        }
      } while (isLooping);
    } catch (Exception e) {
      System.out.println("Terjadi error: " + e.getMessage());
    }
  }
}
