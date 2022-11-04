package piatek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try (
                var fileWriter = new FileWriter(fileName,true);
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write("3");
            writer.newLine();
            writer.write("45");
            writer.newLine();
            writer.write("6534");

        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}