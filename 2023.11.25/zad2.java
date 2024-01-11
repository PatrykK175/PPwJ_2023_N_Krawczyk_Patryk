import java.util.Scanner;
import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy macierzy: ");
        int rows = scanner.nextInt();

        System.out.print("Podaj liczbę kolumn macierzy: ");
        int cols = scanner.nextInt();

        int[][] macierzA = generujMacierz(rows, cols);
        int[][] macierzB = generujMacierz(rows, cols);

        System.out.println("Macierz A:");
        wypiszMacierz(macierzA);

        System.out.println("Macierz B:");
        wypiszMacierz(macierzB);

        int[][] sumaMacierzy = dodajMacierze(macierzA, macierzB);

        System.out.println("Suma macierzy A i B:");
        wypiszMacierz(sumaMacierzy);

        scanner.close();
    }

    private static int[][] generujMacierz(int rows, int cols) {
        
        int[][] macierz = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                macierz[i][j] = random.nextInt(10);
            }
        }

        return macierz;        
    }

    private static void wypiszMacierz(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] dodajMacierze(int[][] macierzA, int[][] macierzB) {
        int rows = macierzA.length;
        int cols = macierzA[0].length;

        int[][] sumaMacierzy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumaMacierzy[i][j] = macierzA[i][j] + macierzB[i][j];
            }
        }

        return sumaMacierzy;
    }


}
