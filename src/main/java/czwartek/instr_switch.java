package czwartek;

import java.util.Scanner;

public class instr_switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar(S,M,L,XL)");
        String shortSize = scanner.nextLine();


//        String size = switch (shortSize){
//            case "s":
//                yield "mały";
//            case "m":
//                yield "średni";
//            case "l":
//                yield "duży";
//            case "xl":
//                yield "b duży";
//            default:
//                yield "nieznany";
//        };

//        String size = switch (shortSize) {
//            case "s" -> {
//                System.out.println("Brak rozmiaru!");
//                yield "mały";
//            }
//            case "m" -> "średni";
//            case "l" -> "duży";
//            case "xl","xxl" -> "b duży";
//            default -> "nieznany";
//        };

        System.out.println(switch (shortSize) {
            case "s" -> "mały";
            case "m" -> "średni";
            case "l" -> "duży";
            case "xl","xxl" -> "b duży";
            default -> "nieznany";
        });






//        switch (shortSize) {
//            case "s":
//                size = "mały";
//                break;
//            case "m":
//                size = "średni";
//                break;
//            case "l":
//                size = "duży";
//                break;
//            case "xl":
//                size = "bardzo duży";
//                break;
//            default:
//                size = "nieznany";
//
//        }
//        System.out.println("Wybrano rozmiar: " + size);


    }
}
