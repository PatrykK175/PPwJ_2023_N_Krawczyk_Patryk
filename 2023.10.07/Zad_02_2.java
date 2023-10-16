import java.util.Scanner;

public class Zad_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();

        double wynik = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę rzeczywistą: ");
            double liczba = scanner.nextDouble();

            if (liczba > 0) {
                wynik += 2 * liczba;
            }
        }

        System.out.println("Wynik: " + wynik);
        scanner.close();
    }
}