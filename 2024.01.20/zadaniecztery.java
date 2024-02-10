import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zadaniecztery {
    public static void main(String[] args) {
        String plikDoOdczytu = "plik.txt"; 
        String plikDoZapisu = "plik2.txt";

        try {
            List<String> lista = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(plikDoOdczytu));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                lista.add(line);
            }
            reader.close();

            for (int i = 0; i < lista.size() - 1; i += 2) {
                Collections.swap(lista, i, i+1);
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(plikDoZapisu));

            for (String l : lista) {
                writer.write(l);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
