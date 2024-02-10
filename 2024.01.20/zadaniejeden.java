import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class zadaniejeden {
    public static void main(String[] args) {
        
        double[] liczbyDoZapisania = {23123.123, 3.23, 1231232.123, 12.230};
        String fileName = "doubleArray.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (double liczba : liczbyDoZapisania) {
                writer.write(Double.toString(liczba));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                double liczba = Double.parseDouble(line);
                System.out.println(liczba);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}