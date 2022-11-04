package data;

public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;
    private static final double FUEL_CON = 8;
    private static final double MAX_F = 50;
    private double fuel;


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        if (year > 2000) {
            this.year = year;
        } else {
            System.out.println("Auto musi być nowsze!");
        }
    }


    // konstruktor1
    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    // konstruktor2
    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public void print() {
        System.out.println(brand + " " + model + " " + year + " " + color);
    }

    public void refuel(double additionalFuel) throws Exception {
        if (fuel + additionalFuel > MAX_F)
            throw new Exception("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_F - fuel));
        else
            fuel += additionalFuel;
    }

    public void drive() {
        if (fuel - FUEL_CON < 0)
            throw new IllegalStateException("Masz za mało paliwa na podróż, zatankuj.");
        else
            fuel -= FUEL_CON;
    }

    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}