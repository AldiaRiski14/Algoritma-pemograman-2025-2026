import java.util.Scanner;

public class kartuindosehat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nama;
        String alamat;
        int umur;
        int nik;

        System.out.println("Input Data Member Kartu Indonesia Sehat");

        System.out.println("Masukkan nama kamu : ");
        nama = scanner.nextLine();

        System.out.println("Masukkan alamat kamu : ");
        alamat = scanner.nextLine();

        System.out.println("Masukkan umur kamu : ");
        umur = scanner.nextInt();

        System.out.println("Masukkan nik kamu : ");
        nik = scanner.nextInt();

        System.out.println("\n***********************************************");
        System.out.println("-------Member Kartu Indonesia Sehat-------");
        System.out.println("Nama kamu = " + nama);
        System.out.println("Alamat kamu = " + alamat);
        System.out.println("Umur kamu = " + umur);
        System.out.println("Nik kamu = " + nik);

        System.out.println("***********************************************");
    }
}
