import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            float floatAngka = 0.0f;

            boolean validFloatAngka = false;

            do {
                System.out.println("Masukkan angka yang kamu sukai : ");
                String angka = scanner.nextLine();

                try {
                    floatAngka = Float.parseFloat(angka);
                    validFloatAngka = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("Hola, kamu tidak memasukkan angka float yang benar");
                }

            } while (validFloatAngka == false);

            System.out.println("Angka favoritmu : " + floatAngka);
        }

    }
}
