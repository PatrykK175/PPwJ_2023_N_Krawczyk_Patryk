import java.util.Scanner;

public class Zad_02_1_f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();
        int wynik = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj element a" + i + ": ");
            int liczba = scanner.nextInt();

            if (i % 2 == 1 && liczba % 2 == 0) {
                wynik++;
            }
        }

        System.out.println("Wynik: " + wynik);
        scanner.close();
    }
}