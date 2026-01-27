import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumelimassegitigas {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double La, t, v;

        System.out.println("=== Menghitung Volume Limas Segitiga ===");

        System.out.println("Masukkan nilai La (luas alas) : ");
        La = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai t (tinggi limas segitiga) : ");
        t = Integer.parseInt(input.readLine());

        v = 1.0 / 3.0 * La * t;

        System.out.println("Volume Limas Segitiga : " + v);
    }

}
