package Inheritance.Zoo;

public class Cat extends Animal{

    public Cat(String color, String name) {
        super(color, name);
    }

    @Override
    public void giveInfo() {
        System.out.println("Jestem kotem i nazywam się: " + getName() + " i mam kolor: " + getColor());
    }

    public void meow(){
        System.out.println("Miau miau");
    }
}
