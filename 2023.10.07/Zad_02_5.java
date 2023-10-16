import java.util.Scanner;

public class Zad_02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podaj liczbę większą od zera.");
            scanner.close();
            return;
        }

        double previousNumber = 0;
        double currentNumber;
        int countPositivePairs = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę: ");
            currentNumber = scanner.nextDouble();

            if (currentNumber > 0 && previousNumber > 0) {
                countPositivePairs++;
            }

            previousNumber = currentNumber;
        }

        System.out.println("Wynik: " + countPositivePairs);

        scanner.close();
    }
}
