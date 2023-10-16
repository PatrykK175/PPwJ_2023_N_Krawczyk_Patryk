import java.util.Scanner;

public class Zad_02_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podaj liczbę większą od zera.");
            scanner.close();
            return;
        }

        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę: ");
            double liczba = scanner.nextDouble();

            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max = liczba;
            }
        }

        System.out.println("Najmniejsza: " + min);
        System.out.println("Największa: " + max);

        scanner.close();
    }
}
