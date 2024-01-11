import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe wierszy macierzy A (m): ");
        int m = scanner.nextInt();

        System.out.print("Podaj liczbe kolumn macierzy A (n): ");
        int n = scanner.nextInt();

        System.out.print("Podaj liczbe kolumn macierzy B (k): ");
        int k = scanner.nextInt();

        int[][] macierzA = generujMacierz(m, n);
        int[][] macierzB = generujMacierz(n, k);

        System.out.println("Macierz A:");
        wypiszMacierz(macierzA);

        System.out.println("Macierz B:");
        wypiszMacierz(macierzB);

        int[][] iloczynMacierzy = obliczIloczynMacierzy(macierzA, macierzB);

        System.out.println("Iloczyn macierzy A i B (macierz C):");
        wypiszMacierz(iloczynMacierzy);

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

    private static int[][] obliczIloczynMacierzy(int[][] macierzA, int[][] macierzB) {
        int m = macierzA.length;
        int n = macierzA[0].length;
        int k = macierzB[0].length;

        int[][] iloczynMacierzy = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < n; x++) {
                    iloczynMacierzy[i][j] += macierzA[i][x] * macierzB[x][j];
                }
            }
        }

        return iloczynMacierzy;
    }

}
