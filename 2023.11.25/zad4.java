import java.util.Random;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy kwadratowej (n): ");
        int n = scanner.nextInt();

        int[][] tablica = generujTabliceKwadratowa(n);

        System.out.println("Tablica wygenerowana:");
        wypiszTablice(tablica);

        int sumaNadPrzekatna = obliczSumeNadPrzekatna(tablica);
        int sumaPodPrzekatna = obliczSumePodPrzekatna(tablica);

        System.out.println("Suma elementów nad główną przekątną: " + sumaNadPrzekatna);
        System.out.println("Suma elementów pod główną przekątną: " + sumaPodPrzekatna);

        scanner.close();
    }

    private static int[][] generujTabliceKwadratowa(int n) {
        int[][] tabela = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabela[i][j] = random.nextInt(10);
            }
        }

        return tabela; 
    }

    private static void wypiszTablice(int[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int obliczSumeNadPrzekatna(int[][] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < i; j++) {
                suma += tablica[i][j];
            }
        }
        return suma;
    }

    private static int obliczSumePodPrzekatna(int[][] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i + 1; j < tablica[i].length; j++) {
                suma += tablica[i][j];
            }
        }
        return suma;
    }
}
