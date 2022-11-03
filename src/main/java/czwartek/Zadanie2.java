package czwartek;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz zsumować:");
        int numbers = sc.nextInt();

        int sum = 0;
        while (numbers-- > 0) {
            System.out.println("podaj kolejną liczbę:");
            sum = sum + sc.nextInt();
        }
        System.out.println("Suma: " + sum);
        sc.close();

    }
}
