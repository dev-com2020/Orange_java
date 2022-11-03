import czwartek.Klocki;

public class Tetris {
    public static void main(String[] args) {

        Klocki gra1 = new Klocki();
        int suma = gra1.nowyKlocek(5, 6);
        int suma2 = gra1.nowyKlocek(15, 86);
        System.out.println(suma);
        System.out.println(suma2);
        int roznica = gra1.usunKlocek(67, 3);
        System.out.println(roznica);
        gra1.info();
        gra1.info2(5, 5);
    }
}
