package Super;

public class Computer {
    private double cpuTemperature; // temp procesora
    private int ramMemory; // MB

    // konstruktor
    public Computer(double cpuTemperature, int ramMemory) {
        super();
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }

    public Computer(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
    public void coolDown(){
        cpuTemperature = cpuTemperature -1 ;
    }
}
