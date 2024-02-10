import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class zadaniedwa {

    public static void main(String[] args) {
        char[][] tablica = { 
            { 'a', 'b', 'c' }, 
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' }
        };
        String nazwaPliku = "2dCharArray.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku));

            for (int i = 0; i < tablica.length; i++) {
                for (int j = 0; j < tablica[i].length; j++) {
                    writer.write(tablica[i][j]);
                }
                writer.newLine();
            }

            writer.close();
            System.out.println("Dane zapisano do pliku: " + nazwaPliku);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku));
            String line;
            System.out.println("Odczytane dane z pliku:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu z pliku: " + e.getMessage());
        }
    }
}
