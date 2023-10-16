import java.util.Scanner;

public class Zad_02_1_e {
    public static int silnia(int m) {
        int wynik = 1;
        for (int i = 1; i <= m; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();
        int iloscSpelniaWarunek = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Podaj element a" + i + ": ");
            int liczba = scanner.nextInt();

            if ((1 << i) < liczba && liczba < silnia(i)) {
                iloscSpelniaWarunek++;
            }
        }

        System.out.println("Wynik: " + iloscSpelniaWarunek);

        scanner.close();
    }

}