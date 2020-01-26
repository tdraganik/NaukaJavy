package Inheritance.Wholesale;

class ExhaustPart extends Part {

    public ExhaustPart(int id, String manufacturesName, String model, String series, boolean norm) {
        this.norm = norm;
        setId(id);
        setManufacturesName(manufacturesName);
        setModel(model);
        setSeries(series);

    }

    public boolean isNorm() {
        return norm;
    }

    public void setNorm(boolean norm) {
        this.norm = norm;
    }

    private boolean norm;

    void printInfo(){
        System.out.println("Opona: ID "  + getId()
                + " Fabryka: " + getManufacturesName()
                + " Model: " + getModel()
                + " Seria: " + getSeries()
                + " Norma: "  + norm);
    }
    }

