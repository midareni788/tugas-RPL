import java.util.Scanner;

public class tugas9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilihan menu:");
            System.out.println("1. Penentuan Angka Terbesar");
            System.out.println("2. Penentuan Angka Ganjil dan Genap");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Kode untuk mencari angka terbesar
                    System.out.print("Masukkan angka pertama: ");
                    int angka1 = input.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    int angka2 = input.nextInt();

                    int angkaTerbesar = Math.max(angka1, angka2);
                    System.out.println("Angka terbesar adalah: " + angkaTerbesar);
                    break;
                case 2:
                    // Kode untuk menentukan ganjil atau genap
                    System.out.print("Masukkan angka pertama: ");
                    angka1 = input.nextInt();
                    System.out.print("Masukkan angka kedua: ");
                    angka2 = input.nextInt();

                    if (angka1 % 2 == 0) {
                        System.out.println(angka1 + " adalah bilangan genap.");
                    } else {
                        System.out.println(angka1 + " adalah bilangan ganjil.");
                    }

                    if (angka2 % 2 == 0) {
                        System.out.println(angka2 + " adalah bilangan genap.");
                    } else {
                        System.out.println(angka2 + " adalah bilangan ganjil.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));
    }
}