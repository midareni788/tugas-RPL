import java.util.Scanner;
public class operatur16 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("masukan nilai siswa");
    int nilai = scanner.nextInt();

    String hasil = (nilai>= 75) ? "naik kelas" : "Tidak naik kelas";

    System.out.println("hasil : " + hasil);
    scanner.close();
 }   
}
