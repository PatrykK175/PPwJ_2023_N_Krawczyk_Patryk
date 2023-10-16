import java.util.Scanner;

public class Zad_01_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów w ciagu (n): ");
        int n = scanner.nextInt();

        int[] ciag = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element ciągu a" + (i + 1) + ": ");
            ciag[i] = scanner.nextInt();
            suma += Math.abs(ciag[i]);
        }

        System.out.print("Suma = " + suma);

        scanner.close();
    }
}
