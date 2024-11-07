import java.util.Scanner;
public class percabangan1 {
    public static boolean  percabangan1(int totalBelanja) {
        
        int minimalBelanja = 5000000;
        return totalBelanja >= minimalBelanja;


    }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Program Pemberian Hadiah Gantungan kunci");
         System.out.println("----------------------------------------");
         System.out.println("Masukan total belanja: Rp");
         int totalBelanja = scanner.nextInt();

         if(percabangan1(totalBelanja)){
            System.out.println("Selamat Anda berhakmendapatkan gantungan kunci!");
         }else {
            System.out.println("Maaf, Anda Belum Berhak Mendapatkan Gantungan Kunci");
         }
         scanner.close();
     }
}