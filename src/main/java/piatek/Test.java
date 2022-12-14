package piatek;


import java.util.InputMismatchException;
import java.util.Scanner;


//InputMismatchException

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Podaj 1 liczbę:");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj 2 liczbę:");
                numbers[1] = sc.nextInt();
                System.out.println("Którą wartość wyświetlić(1 lub 2)");
                System.out.println("Liczba: " + numbers[sc.nextInt() - 1]);
                error = false;
            } catch (Exception e) {
//            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Podana wartość jest nieprawidłowa! Spróbuj jeszcze raz...");
                e.printStackTrace();
            } finally {
                sc.nextLine();
            }
        } while (error);
        sc.close();
    }
}
