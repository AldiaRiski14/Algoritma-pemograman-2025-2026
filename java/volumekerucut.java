import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumekerucut {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Menghitung Volume Kerucut ===");
        System.out.print("Masukkan nilai r (jari-jari) : ");
        double r = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai t (tinggi) : ");
        double t = Double.parseDouble(input.readLine());

        double v = (1.0 / 3.0) * Math.PI * r * r * t;
        System.out.println("Volume Kerucut : " + v);
    }

}
