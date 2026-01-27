import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumelimas {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double Lalas, t, v;

        System.out.println("=== Menghitung Volume Limas Segi Empat ===");

        System.out.println("Masukkan nilai Lalas (luas alas) : ");
        Lalas = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai t (tinggi limas segi empat) : ");
        t = Integer.parseInt(input.readLine());

        v = 1.0 / 3.0 * Lalas * t;

        System.out.println("Volume Limas Segi Empat : " + v);
    }

}
