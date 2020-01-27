package Inheritance.Zoo;

public class Bird extends Animal {

    public Bird(String color, String name) {
        super(color, name);
    }

    public void giveInfo() {
        System.out.println("Jestem ptakiem i nazywam się " + getName() + " i mam kolor: " + getColor());
    }

    public void tweet(){
        System.out.println("Ćwir ćwir");
    }
}
