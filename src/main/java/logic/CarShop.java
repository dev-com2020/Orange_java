package logic;

import data.Car;

class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(1999, "Audi", "A5", "Czarne");
        Car audiA4 = new Car(2015, "Audi", "A4");
        //w międzyczasie klient wybiera kolor:
        audiA4.setColor("Czerwony");
        audiA5.setYear(1985);
        audiA5.print();
        audiA4.print();
        String audiA4color = audiA4.getColor();
        System.out.println(audiA4color);
        try {
            audiA5.refuel(40);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println(audiA5);
        try {
            audiA5.drive();
        } catch (IllegalStateException e){
            System.err.println(e.getMessage());
        }

        System.out.println(audiA5);

    }
}