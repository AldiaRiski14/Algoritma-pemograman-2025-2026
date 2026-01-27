import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumeprisma {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double LAlas, t, v;

        System.out.println("=== Menghitung Volume Prisma ===");

        System.out.println("Masukkan nilai LAlas (luas alas) : ");
        LAlas = Integer.parseInt(input.readLine());

        System.out.println("Masukkan nilai t (tinggi prisma) : ");
        t = Integer.parseInt(input.readLine());

        v = LAlas * t;

        System.out.println("Volume Prisma : " + v);
    }

}
