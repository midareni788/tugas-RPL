import java.util.Scanner;

public class percabangan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan merk celana (ABC/DEF): ");
        String merk = scanner.nextLine();

        System.out.println("Masukan ukuran celana (26-34): ");
        int ukuran = scanner.nextInt();

        int harga = 0;
        boolean valid = true;

        switch (merk) {
            case "ABC":
                if (ukuran >= 26 && ukuran <= 30) {
                    harga = 16000;
                } else if (ukuran >= 31 && ukuran <= 34) {
                    harga = 180000;
                } else {
                    valid = false;
                }
                break;
            case "DEF":
                if (ukuran >= 26 && ukuran <= 30) {
                    harga = 210000;
                } else if (ukuran >= 31 && ukuran <=34) {
                    harga = 220000;
                } else {
                    valid = false;
                }
                break;
        }

        if (valid) {
            System.out.println("Harga celana " + merk + "ukuran" + ukuran + "adalah: Rp. "+ harga);
        } else {
            System.out.println("Merk atau ukuran yang anda masukan tidak valid.");
        }
    }
}