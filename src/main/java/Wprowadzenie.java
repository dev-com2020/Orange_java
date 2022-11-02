import java.util.Locale;
import java.util.Scanner;

/**
 * Klasa Wprowadzenie służy do wprowadzenia danych z klawiatury
 * @version 0.1b
 * @author Comarch
 */


public class Wprowadzenie {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Wprowadź swoje imię: ");
//        String imie = input.nextLine();
//        System.out.println("Wprowadź swoje nazwisko: ");
//        String nazw = input.nextLine();
//        System.out.println("Podaj swój wiek:");
//        int wiek = input.nextInt();
//        input.close();
//
//        System.out.println("Cześć " + imie + " " + nazw);
//        System.out.println("Masz " + wiek + " lat.");
//        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);
//        System.out.println("Podaj A: ");
//        double a = input.nextDouble();
//        System.out.println("Podaj B: ");
//        double b = input.nextDouble();
//
//        input.close();
//        System.out.println("A + B = " + (a + b));
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        // do word zostanie przypisany znak nowej linii, który wciąż będzie w buforze
        String word = sc.nextLine();
        // po wczytaniu liczby nastąpi od razu wyświetlenie wartości
        System.out.println(number);
        System.out.println(word);

        sc.close();
    }
}
