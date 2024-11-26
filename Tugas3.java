import java.util.Scanner;

public class Tugas3 {
  public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    System.out.println("=== Data Nilai Mahasiswa ===\n");
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jmlMhs = input15.nextInt();
    System.out.print("Masukkan jumlah tugas: ");
    int jmlTugas = input15.nextInt();
    int[][] nilai = new int[jmlMhs][jmlTugas];
    inputData(nilai);
    tampilkanData(nilai);
    int indeks = nilaiTertinggi(nilai);
    System.out.println("\nMahasiswa dengan nilai terbanyak:");
    System.out.print("Mahasiswa ke-" + (indeks + 1));
    rataRataNilai(nilai);

    input15.close();
  }
  // fungsi menginputkan data
  public static void inputData(int[][] arr) {
    Scanner input15 = new Scanner(System.in);
    System.out.println("\nMasukkan data nilai mahasiswa");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Mahasiswa ke-" + (i + 1));
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("Tugas ke-" + (j + 1) + ": ");
        arr[i][j] = input15.nextInt();
      }
      System.out.println();
    }

    input15.close();
  } 
  // fungsi menampilkan data
  public static void tampilkanData(int[][] arr) {
    // menampilkan tugas
    for (int i = 0; i < arr[0].length; i++) {
      if (i == 0) {
        System.out.print("Tugas\t\t" + (i + 1));
      } else {
        System.out.print("\t" + (i + 1));
      }
    }
    System.out.println();
    // menampilkan nilai mahasiswa
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
  }
  // fungsi menampilkan mhs dengan nilai tertinggi
  public static int nilaiTertinggi(int[][] arr) {
    int[] total = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        total[i] += arr[i][j];
      }
    }

    int nilaiMaks = total[0];
    int indeks = 0;

    for (int i = 1; i < total.length; i++) {
      if (total[i] > nilaiMaks) {
        nilaiMaks = total[i];
        indeks = i;
      }
    }
    return indeks;
  }
  // fungsi menampilkan rata-rata nilai setiap mhs
  public static void rataRataNilai(int[][] arr) {
    System.out.println("\nRata-rata nilai setiap mahasiswa");
    for (int i = 0; i < arr.length; i++) {
      int total = 0;
      double rata2;
      System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
      for (int j = 0; j < arr[i].length; j++) {
        total += arr[i][j];
      }
      rata2 = (double) total / arr[0].length;
      System.out.print(rata2);
      System.out.println();
    }
  }
}