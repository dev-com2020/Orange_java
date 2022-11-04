package piatek;

public class Wielo {

    public static void main(String[] args) {
//            int x1,x2,x3,
//                x4,x5,x6,
//                x7,x8,x9;
//
//            int[] tab1 = new int[3];
//            int[] tab2 = new int[3];
//            int[] tab3 = new int[3];

//            int[][] tab = new int[3][3];
//            tab[0][0] = 5;
//            tab[1][1] = 5;
//            tab[2][2] = 5;
//        System.out.println(tab[0][0]);
//
//        int[][] array = new int[3][];
//        array[0] = new int[3];
//        array[1] = new int[2];
//        array[2] = new int[1];
//        System.out.println(array[2][0]);

        String[] firstNames = { "Jan", "Kasia", "Basia" };
        String[] lastNames = { "Kowalski", "Nowakowska", "Wadecka" };

        String[][] firstLast = { firstNames, lastNames };

        System.out.println("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);

    }
}
