import java.util.Scanner;

public class kasirmini {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama barang: ");
        String nama = sc.nextLine();

        System.out.println("Masukkan harga barang: ");
        double harga = sc.nextDouble();

        System.out.println("Masukkan jumlah barang: ");
        int jumlah = sc.nextInt();

        double total = harga * jumlah;
        double diskon;

        if (total > 67300) {
            diskon = total * 0.03;
        } else {
            diskon = 0;
        }

        double totalBayar = total - diskon;

        System.out.println("\n==== STRUK BELANJA ====");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Satuan  : " + harga);
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + totalBayar);
        System.out.println("=======================");
        sc.close();
    }
}
