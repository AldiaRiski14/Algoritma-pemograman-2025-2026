import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumebola {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Menghitung Volume Bola ===");
        System.out.print("Masukkan nilai r (jari-jari) : ");
        double r = Double.parseDouble(input.readLine());

        double v = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Volume Bola : " + v);
    }

}
