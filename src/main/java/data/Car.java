package data;

public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
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
    public void print(){
        System.out.println(brand + " " + model + " " + year + " " + color);
    }
}