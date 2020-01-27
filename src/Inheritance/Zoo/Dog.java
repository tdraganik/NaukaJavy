package Inheritance.Zoo;

public class Dog extends  Animal {

    public Dog(String color, String name) {
        super(color, name);
    }

    @Override
    public void giveInfo() {
        System.out.println("Jestem psem i nazywam się: " + getName() + " i mam kolor: " + getColor());
    }

    public void bark(){
        System.out.println("Hau hau");
    }
}
