import java.util.Scanner;

public class Larik2 {

  public static void main(String[] args) {
    // Deklarasi array
    String[] nama = new String[5];
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Masukkan nama temanmu "+ i+":");
      nama[i] = scan.nextLine();
    }

    // cetak nama
    System.out.print("Kamu adalah teman dari ");
    for (int i = 0; i < 4; i++) {
        System.out.print(nama[i]+" ,");
    }
    System.out.println("dan "+nama[4]);
    scan.close();
  }
}
