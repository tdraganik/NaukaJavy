package Inheritance.Zoo;

public class Animal {

    private String color;
    private String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void giveInfo(){
        System.out.println("Jestem zwierzęciem, mam na imię:" + name + " i mam kolor: " + getColor() );
    }
}
