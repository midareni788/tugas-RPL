import java.util.Scanner;

public class input2 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Masukan nama sekolah;");
        String namaSekolah = input.nextLine();

        System.out.println("Masukan jarak rumah ke sekolah (km)");
        double jarak = input.nextDouble();
        
        input.nextLine();

        System.out.println("Masukan kode plat nomor kendaraan; ");
        char kodePlat = input.nextLine().charAt(0);

        System.out.println("Masukan anak keberapa; ");
        int anakke = input.nextInt();

        System.out.println("\nBiodata Anda: ");
        System.out.println("Nama Sekolah:" + namaSekolah);
        System.out.println("Jarak Rumah Ke Sekolah:" + jarak + "km");
        System.out.println("Kode Plat Nomor Kendaraan:" + kodePlat);
        System.out.println("Anak Ke:" + anakke);

        input.close();
    }
}
