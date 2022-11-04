package piatek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileTesterTry {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
//                var reader = new BufferedReader(new FileReader("test.txt"));
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}