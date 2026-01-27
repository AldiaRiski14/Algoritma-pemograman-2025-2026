import java.util.Scanner;

public class pernyataanswitchcase {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("s: Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("x: Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("x: Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("x: Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("x: Warna lampu salah!");
        }
    }
}