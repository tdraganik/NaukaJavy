package Inheritance.Zoo;

public class Zoo {
    public static void main(String[] args) {


        Animal animal = new Animal("Śnieżny", "Yeti");
        Animal bird = new Bird("Kolorowa", "Ara");
        Animal dog = new Dog("Bury", "Kundel");
        Animal cat = new Cat("Biały", "Filemon");

        Animal specjalAnimal = (Animal) animal;


        if (dog instanceof Dog) {  // jeśli dog jest instacją Dog
            Dog specjalDog = (Dog)dog;
            specjalDog.bark();
        }


        Bird specjalbird = (Bird) bird;

        ((Cat) cat).meow(); // rzutowanie i wywołanie metody w jednym wierszu, zmiana referencji z Animal na Cat w10

        specjalAnimal.giveInfo();

        specjalbird.tweet();
        //bird.tweet();  // błędne wywpłanie metody tweet -  niezbędne jest rzutowanie jak w typoach prostych
    }
}
