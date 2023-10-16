import java.util.Scanner;

public class Zad_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą. ");

        int liczba = scanner.nextInt();

        System.out.println("Podwójna wartość liczby " + (2 * liczba));

        scanner.close();
    }
}