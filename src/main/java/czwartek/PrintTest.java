package czwartek;

public class PrintTest {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        np.printNumber(5);
        np.printNumber(5,4);
        np.printNumber(5,6,43);
    }
}
