package czwartek;

import java.util.Scanner;

public class petle2 {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        final int number = 499;
//        int userInput;
//        System.out.println("Zgadnij liczbę:");
//
//        while ((userInput = reader.nextInt()) != number) {
//            if (userInput > number) {
//                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
//            } else {
//                System.out.println("Podana liczba jest za mała, zgaduj dalej");
//            }
//        }
//        System.out.println("Brawo!!!");
//        reader.close();
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("Liczba " + i);
//            i++;
//        }
        int i = 2;
        do {
            System.out.println("Liczba: " + i);
            i++;
        } while (i < 6);

        System.out.println("Liczba w while " + i);


    }
}
