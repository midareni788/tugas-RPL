import java.util.Scanner;
public class operator12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Tinggi Badan Anda: ");
        double tinggiBadan = scanner.nextDouble();

        System.out.println("Masukan Nilai UN Anda: ");
        double nilaiUN = scanner.nextDouble();

        double mainTinggi = 160;
        double mainNilai = 80;

        if (tinggiBadan >= minTinggi && nilaiUn >= minNilai)  {
            System.out.println("true : Kamu Memenuhi Persyaratan");
        } else {
            System.out.println("false: Kamu Tidak Memenuhi");
        }
        
    }   
}   