package Inheritance.Vehicle;

public class WheeledVehicle extends Vehicles {

    private int wheels;
    private int doors;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
