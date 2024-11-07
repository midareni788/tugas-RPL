import java.util.Scanner;
public class tugas15 {
    public static void main(String[] args) {
        //Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nilai a:");
        int a = scanner.nextInt();

        System.out.println("Masukan nilai b");
        int b = scanner.nextInt();

        int leftShiftresult = a << 2;
        int rightShiftresult = b >> 2;

        System.out.println("Hasil left  shift(a << 2): " + leftShiftresult );

        System.out.println("Hasil right  shift(b >> 2): " + rightShiftresult );

        scanner.close();
    }
}