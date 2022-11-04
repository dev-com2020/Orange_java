package piatek;


import java.util.InputMismatchException;
import java.util.Scanner;


//InputMismatchException

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = 0;
        boolean error = true;
        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException e) {
                System.err.println("Podana wartość jest nieprawidłowa! Spróbuj jeszcze raz...");
                sc.nextLine();
//            e.printStackTrace();
            }
        } while (error);
        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
