import java.util.Scanner;

public class percabangan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();
        
        String namaHarian;

        switch (angka) {
            case 1:
                namaHarian ="Minggu";
            case 2:
                namaHarian = "Senin";
            case 3:
                namaHarian = "Selasa";
            case 4:
                namaHarian ="Rabu";
            case 5:
                namaHarian ="Kamis";
            case 6:
               namaHarian = "Jum’at";
               break;
            case 7:
                namaHarian = "Sabtu";
            default:
                namaHarian =  "Angka tidak valid. Masukkan angka antara 1 hingga 7.";
                break;
        }

        System.out.println("Hari: " + namaHarian);
    }
}