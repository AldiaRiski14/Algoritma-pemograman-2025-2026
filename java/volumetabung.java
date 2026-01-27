import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumetabung {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double r, t, v;

        System.out.println("=== Menghitung Volume Tabung ===");

        System.out.println("Masukkan nilai r (jari-jari) : ");
        r = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai t (tinggi) : ");
        t = Integer.parseInt(input.readLine());

        v = Math.PI * r * r * t;

        System.out.println("Volume Tabung : " + v);
    }

}
