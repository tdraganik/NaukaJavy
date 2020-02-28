package AbstractClass.Example;


class Car extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }
}
