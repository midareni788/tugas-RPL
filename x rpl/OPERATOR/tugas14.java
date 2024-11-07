import java.util.Scanner;
public class tugas14 {
    public static void main(String[] args) {
        // Daftar NIS siswa yang lulus 
        int[] nisLulus = {1001, 1002, 1003, 1004,};

        // Membuat scanner untuk input user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan NIS: ");
        int inputNIS = scanner.nextInt();

        // Memeriksa apakah NIS adadalam daftar
        boolean isLulus = false;
        for(int nis : nisLulus) {
            isLulus = true;
            break;
        }
    }
}