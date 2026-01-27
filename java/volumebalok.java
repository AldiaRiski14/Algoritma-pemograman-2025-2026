import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumebalok {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int p, l, t, v;

        System.out.println("=== Menghitung Volume Balok ===");

        System.out.println("Masukkan nilai p (panjang balok) : ");
        p = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai l (lebar balok) : ");
        l = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai p (tinggi balok) : ");
        t = Integer.parseInt(input.readLine());

        v = p * l * t;

        System.out.println("Volume Balok : " + v);
    }

}
