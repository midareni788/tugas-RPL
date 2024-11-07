import java.util.Scanner;
public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan Pertanyaan
        System.out.println("1. Operator Indosat");
        System.out.println("1. Operator Aritmatika");
        System.out.println("1. Operator Telkomsel");
        System.out.println("1. Operator Assigment");

        // Meminta input pengguna
        System.out.println("Masukan Nomor Jawaban (1-4): ");
        int jawaban = scanner.nextInt();

        // Memeriksa jawaban
        if (jawaban == 2 || jawaban == 4); {
            System.out.println("Jawaban Anda benar!");

        }{
            System.out.println("Jawaban Anda Salah. Jawaban yang benar adalah: Operator Aritmatika dan Operator Assigment.");
        }

        // Menutup Scanner scanner.close();
        
    }
}
    
