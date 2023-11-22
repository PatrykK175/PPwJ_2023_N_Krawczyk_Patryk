import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Podaj rok: ");

        int rok = year.nextInt();

        if (rok % 400 == 0 || rok % 4 == 0 && rok % 100 != 0 ) {
            Scanner miesiac = new Scanner(System.in);

            System.out.print("Podaj nr miesiąca: ");
            
            int numerMies = miesiac.nextInt();

            int[] miesiace = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

            if (numerMies > 0 && numerMies < 13) {
                int n = miesiace[numerMies];
                System.out.println("Twój miesiąc ma " + n + " dni");
            } else {
                System.out.println("Podałeś złą liczbę");
            }
            
            miesiac.close();
        } else {
            Scanner miesiac = new Scanner(System.in);

            System.out.print("Podaj nr miesiąca: ");
            
            int numerMies = miesiac.nextInt();

            int[] miesiace = {0, 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

            if (numerMies > 0 && numerMies < 13) {
                int n = miesiace[numerMies];
                System.out.println("Twój miesiąc ma " + n + " dni");
            } else {
                System.out.println("Podałeś złą liczbę");
            }
            
            miesiac.close();
        }

        year.close();
    }
}
