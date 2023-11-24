import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą datę w formacie DD.MM.YYYY: ");
        String data1 = scanner.nextLine();

        System.out.print("Podaj drugą datę w formacie DD.MM.YYYY: ");
        String data2 = scanner.nextLine();

        int roznicaDni = obliczRozniceDni(data1, data2);

        if (roznicaDni != -1) {
            System.out.println("Różnica w dniach: " + roznicaDni + " dni.");
        } else {
            System.out.println("Nieprawidłowy format daty.");
        }
    }

    private static int obliczRozniceDni(String data1, String data2) {
        try {
            int dzien1 = Integer.parseInt(data1.substring(0, 2));
            int miesiac1 = Integer.parseInt(data1.substring(3, 5));
            int rok1 = Integer.parseInt(data1.substring(6, 10));

            int dzien2 = Integer.parseInt(data2.substring(0, 2));
            int miesiac2 = Integer.parseInt(data2.substring(3, 5));
            int rok2 = Integer.parseInt(data2.substring(6, 10));

            int dniWMiesiacach1 = dniWMiesiacach(miesiac1, rok1);
            int dniWMiesiacach2 = dniWMiesiacach(miesiac2, rok2);

            int roznicaDni = dzien2 - dzien1;

            for (int i = rok1; i < rok2; i++) {
                roznicaDni += dniWRoku(i);
            }

            roznicaDni += dniWMiesiacach2 - dniWMiesiacach1;

            return roznicaDni;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return -1;
        }
    }

    private static int dniWMiesiacach(int miesiac, int rok) {
        int[] dniWMiesiacu = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (miesiac == 2 && rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) {
            return dniWMiesiacu[miesiac] + 1;
        }
        return dniWMiesiacu[miesiac];
    }

    private static int dniWRoku(int rok) {
        return (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) ? 366 : 365;
    }
}