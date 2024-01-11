import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj datę w formacie DD.MM.YYYY: ");
        String inputData = scanner.nextLine();

        int dayOfYear = getDayOfYear(inputData);
        int year = getYear(inputData);

        if (dayOfYear != -1 && year != -1) {
            System.out.println(inputData + " jest " + dayOfYear + " dniem roku " + year + ".");
        } else {
            System.out.println("Nieprawidłowy format daty.");
        }

        scanner.close();
    }

    private static int getDayOfYear(String date) {
        try {
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));

            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month]) {
                return -1;
            }

            int dayOfYear = day;
            for (int i = 1; i < month; i++) {
                dayOfYear += daysInMonth[i];
            }

            return dayOfYear;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return -1;
        }
    }

    private static int getYear(String date) {
        try {
            return Integer.parseInt(date.substring(6, 10));
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return -1;
        }
    }
}