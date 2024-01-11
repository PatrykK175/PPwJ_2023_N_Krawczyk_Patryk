import java.util.Scanner;
import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą n (1 < n ≤ 100): ");
        int n = scanner.nextInt();

        int[] tablica = generujTablice(n);

        System.out.println("Tablica wygenerowana:");
        wypiszTablice(tablica);

        System.out.println("Unikalne elementy tablicy:");
        wypiszUnikalneElementy(tablica);

        scanner.close();
    }

    private static int[] generujTablice(int n) {
        int[] tablica = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int losowaLiczba;
            do {
                losowaLiczba = random.nextInt(1999) - 999;
            } while (czyZawiera(tablica, losowaLiczba));

            tablica[i] = losowaLiczba;
        }
        return tablica;
    }

    private static boolean czyZawiera(int[] tablica, int liczba) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == liczba) {
                return true;
            }
        }
        return false;
    }

    private static void wypiszTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    private static void wypiszUnikalneElementy(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            boolean unikalny = true;
            for (int j = 0; j < i; j++) {
                if (tablica[i] == tablica[j]) {
                    unikalny = false;
                    break;
                }
            }
            if (unikalny) {
                System.out.print(tablica[i] + " ");
            }
        }
        System.out.println();
    }
}
