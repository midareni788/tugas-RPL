
import java.util.Scanner;


public class input4 {
    public static void main(String[] args) {
        Scanner input
= new Scanner(System.in);

      System.out.println("Masukan nama lengkap: ");
      String namaLengkap = input.nextLine();

      System.out.println("Masukan nomor induk siswa:");
      String nomorInduk = input.nextLine();

      System.out.println("Masukan umur: ");
      int umur = input.nextInt();

      System.out.println("\nBiodata Anda: ");
      System.out.println("Nama Lengkap: " + namaLengkap);
      System.out.println("Nomor Induk Siswa: " + nomorInduk);
      System.out.println("Umur: " + umur);

      input.close();
    }
}