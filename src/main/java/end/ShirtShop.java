package end;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
//        System.out.println(Size.SMALL.getDesc());
//        System.out.println(Size.MEDIUM.getDesc());
//        System.out.println(Size.LARGE.getDesc());
//
//        Tshirt t1 = new Tshirt();
//        t1.setSize(Size.MEDIUM);
//        System.out.println(t1.getSize());
//        System.out.println("Rozmiar koszulki: "+ t1.getSize().getDesc());
//
//        for (Size s:Size.values()){
//            System.out.println(s.getDesc());
//        }

        System.out.println("Dostępne rozmiary: ");
        for (Size s:Size.values()){
            System.out.println(s.getDesc());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar:");
        String sizeDesc = sc.nextLine();
        Size size = Size.fromDesc(sizeDesc);
        Tshirt tshirt = new Tshirt();
        tshirt.setSize(size);
        System.out.println("Wybrałeś koszulkę w rozmiarze: "+ tshirt.getSize().getDesc());

    }
}
