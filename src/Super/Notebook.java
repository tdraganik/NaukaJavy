package Super;

class Notebook extends Computer{

    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public Notebook(int ramMemory, int batteryCapacity) {
        super(ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    private int batteryCapacity; // pojemność baterii mAh

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getCpuTemperature() - 4);
    }
}

