package Inheritance.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setColor("Czarny");

        Bird bird = new Bird();

        bird.setColor("NIebieski");

        System.out.println("Zwierzęta dają głos: " );
        System.out.println("Kot:  " );
        cat.makeSound();
        System.out.println("Ptak: ");
       bird.makeSound();
    }
}
