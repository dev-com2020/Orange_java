package piatek;


import java.util.InputMismatchException;
import java.util.Scanner;


//InputMismatchException

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = 0;
        try {
            number = sc.nextInt();
            System.out.println("Wczytano poprawną liczbę");
        } catch (InputMismatchException ex) {
            System.err.println("Podana wartość jest nieprawidłowa!");
//            ex.printStackTrace();
        }
        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
