import java.lang.invoke.SwitchPoint;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class percabangan6 {
    public static void main(String[] args) {

        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kode plat nomor (hutuf): ");
        String kodePlat= scanner.nextLine().toUpperCase();

        // Menentukan nama kota berdasarkan kode plat
        String namaKota;

        switch (kodePlat) {
            case "N":
                  namaKota = "Malang";
                  break;
            case "B":
                  namaKota = "Jakareta";
                  break;
            case "D":
                  namaKota = "Bandung";
            case "L":
                  namaKota = "Surabaya";
            case "P":
                  namaKota = "Jember,Banyuwangi,Bondowoso,Situbondo";
                  break;
            case "S":
                  namaKota = "Semarang";
                  break;
            case "T":
                  namaKota = "Tanggerang";
                  break;
            default:
                   namaKota = "Kode plat tidak valid. Harap masukkan huruf yang sesuai.";

        }

        // MMenampilkan hasil 
        System.out.println("Kota: " + namaKota);

        // Menytyo scanner
        scanner.close();
    }
    
}

