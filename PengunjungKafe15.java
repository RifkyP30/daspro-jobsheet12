public class PengunjungKafe15 {
  public static void main(String[] args) {

    daftarPengunjung("Messi", "Ronaldo", "Neymar", "Suarez");

  }

  public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (int i = 0; i < namaPengunjung.length; i++) {
      System.out.println("- " + namaPengunjung[i]);
    }
  }

}