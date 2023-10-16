import java.util.Scanner;

public class Zad_02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();

        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą: ");
            double liczba = scanner.nextDouble();

            if (liczba > 0) {
                dodatnie++;
            } else if (liczba < 0) {
                ujemne++;
            } else {
                zera++;
            }
        }

        System.out.println("Dodatnie: " + dodatnie);
        System.out.println("Ujemne: " + ujemne);
        System.out.println("Zera: " + zera);

        scanner.close();
    }
}