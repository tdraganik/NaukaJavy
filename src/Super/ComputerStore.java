package Super;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Computer(40,16384);
        computer.coolDown();

        Notebook notebook = new Notebook(45,8192,10000);
        notebook.coolDown();

        System.out.println(computer.getCpuTemperature() + " " + computer.getRamMemory());
        System.out.println(notebook.getCpuTemperature() + " " + notebook.getRamMemory() + " " + notebook.getBatteryCapacity() );

    }

}
