package end;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Czarny");

        Bird bird = new Bird();
        bird.setColor("Niebieski");

        System.out.println("Zwierzaki wydają głos");
        cat.makeSound();
        bird.makeSound();

    }
}
