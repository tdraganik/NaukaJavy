package Inheritance.Wholesale;

class Tire extends Part {

    public Tire(int id, String manufacturesName, String model, String series, int width, double height) {
        setId(id);
        setManufacturesName(manufacturesName);
        setModel(model);
        setSeries(series);
        this.width = width;
        this.height = height;
    }

    private int width;
    private double height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void printInfo() {
        System.out.println("Opona: ID " + getId()
                + " Fabryka: " + getManufacturesName()
                + " Model: " + getModel()
                + " Seria: " + getSeries()
                + " Szerokość: " + width
                + " Wysokość: " + height);
    }
}
