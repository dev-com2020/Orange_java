package czwartek;

public class Klocki {

    public int nowyKlocek(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    public int usunKlocek(int a, int b) {
        return a - b;
    }

    public void info() {
        System.out.println("Informacje...");
    }

    public void info2(int a, int b) {
        System.out.println("Wynik mnożenia= " + (a * b));
    }

}
