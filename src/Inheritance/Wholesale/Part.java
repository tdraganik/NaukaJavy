package Inheritance.Wholesale;

public class Part {
    private int id;
    private String manufacturesName;
    private String model;
    private String series;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturesName() {
        return manufacturesName;
    }

    public void setManufacturesName(String manufacturesName) {
        this.manufacturesName = manufacturesName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
