import java.util.Scanner;

public class Zad_01_h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów w ciągu (n): ");
        int n = scanner.nextInt();

        int[] ciag = new int[n];
        int wynik = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element ciągu a" + (i + 1) + ": ");
            ciag[i] = scanner.nextInt();

            if (i % 2 == 0) {
                wynik += ciag[i];
            } else {
                wynik -= ciag[i];
            }
        }

        if (n % 2 == 0) {
            wynik = -wynik;
        }

        System.out.print("Wynik = " + wynik);

        scanner.close();
    }
}
