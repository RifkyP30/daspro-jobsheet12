import java.util.Scanner;

public class Kubus15 {
  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    int s, lp, vol;

    System.out.println("Program menghitung luas permukaan & volume kubus\n");
    System.out.print("Masukkan sisi kubus: ");
    s = input15.nextInt();

    lp = hitungLuasPermukaan(s);
    vol = hitungVolume(s);
    System.out.println("Luas permukaan kubus = " + lp);
    System.out.println("Volume kubus = " + vol);

    input15.close();
  }
  // fungsi menghitung luas permukaan kubus
  public static int hitungLuasPermukaan(int s) {
    int luasPermukaan = 6 * s * s;
    return luasPermukaan;
  }
  // fungsi menghitung volume kubus
  public static int hitungVolume(int s) {
    int volume = s * s * s;
    return volume; 
  }
}