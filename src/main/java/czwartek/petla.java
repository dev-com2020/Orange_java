package czwartek;

import java.util.Scanner;

public class petla {
    public static void main(String[] args) {
//        int[] numbers = new int[10];

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//            System.out.println("Iteracja nr: " + i);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Liczba: " + numbers[i]);
//        }
//        for (int liczba : numbers){
//            System.out.println("Liczba: " + liczba);
//        }

//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Podaj liczbę: ");
//            int tmp = sc.nextInt();
//            if (tmp == 10) {
//                System.out.println("Trafiłeś w 10tke!");
//            } else {
//                System.out.println("Podałeś liczbę: " + tmp);
//            }
//        }
//        sc.close();
//    }

//    int[] numbers = new int[3];
//    Scanner sc = new Scanner(System.in);
//
//        for (int i: numbers) {
//        System.out.println("Podaj liczbę: ");
//        int tmp = sc.nextInt();
//        if (tmp == 10) {
//            System.out.println("Trafiłeś w 10tke!");
//        } else {
//            System.out.println("Podałeś liczbę: " + tmp);
//        }
//    }
//        sc.close();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Pierwsza pętla: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla: " + i);
        }
    }
}
