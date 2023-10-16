import java.util.Scanner;

public class Zad_02_1_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        int podzielne = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj element a " + i + ": ");
            int liczba = scanner.nextInt();

            if (liczba % 3 == 0 && liczba % 5 != 0) {
                podzielne++;
            }
        }

        System.out.println("Wynik: " + podzielne);

        scanner.close();
    }
}