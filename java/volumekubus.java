import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class volumekubus {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int s, v;

        System.out.println("=== Menghitung Volume Kubus ===");

        System.out.println("Masukkan nilai s (sisi kubus) : ");
        s = Integer.parseInt(input.readLine());

        v = s * s * s;

        System.out.println("Volume Kubus : " + v);
    }

}
