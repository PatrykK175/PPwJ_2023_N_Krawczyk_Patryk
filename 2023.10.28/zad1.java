import java.util.Scanner;

public class zad1 {
    public static void main(String[] args){
        Scanner miesiac = new Scanner(System.in);

        System.out.print("Podaj nr miesiąca: ");
        
        int numerMies = miesiac.nextInt();

        int[] miesiace = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        if (numerMies > 0 && numerMies < 13) {
            int n = miesiace[numerMies];
            System.out.println(n);
        } else {
            System.out.println("Podałeś złą liczbę");
        }
        
        miesiac.close();
    }
}