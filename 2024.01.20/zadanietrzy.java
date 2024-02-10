import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class zadanietrzy {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Błędna ilość orgumentów: ");
            return;
        }

        String nazwaPliku = args[0];
        String plikDoZapisania = "testx2.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku));
            BufferedWriter writer = new BufferedWriter(new FileWriter(plikDoZapisania));

            int ilosc = 0;
            String line;

            while((line = reader.readLine()) != null){ 
                if (ilosc < 10) {
                    String linia = String.valueOf(line);
                    System.out.println(linia);
                    ilosc++;
                    writer.write(linia);
                    writer.newLine();
                    writer.write(linia);
                    writer.newLine();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
