package czwartek;

public class instrukcja_if {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 50;
        boolean porownanie = a > b;

        if (a > b) {
            System.out.println("Wieksza jest A");
        } else if (a == b) {
            if (a > c)
                System.out.println("A jest większe od C");
            else
                System.out.println("A jest mniejsze od C");

            System.out.println("Liczby są równe");
        } else {
            System.out.println("Większa jest B");
        }

        if (a <= 0) {
            if (a == 0) c = 500;
            else c = -10;
        }
//        if (a <= 0) {if (a == 0) c = 500; else c = -10;}



//        System.out.println("Poza instrukcją...");

//        if (porownanie) {
//            System.out.println("Wieksza jest A");
//        } else {
//            System.out.println("Większa jest B");
//        }
//        System.out.println("Poza instrukcją...");
    }

}
