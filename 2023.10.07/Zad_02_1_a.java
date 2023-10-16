import java.util.Scanner;

public class Zad_02_1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();
        int nieparzyste = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj element a" + i + ": ");
            int liczba = scanner.nextInt();

            if (liczba % 2 != 0) {
                nieparzyste++;
            }
        }

        System.out.println("Wynik: " + nieparzyste);

        scanner.close();
    }
}