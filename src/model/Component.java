package model;

public class Component {
    private String name;
    private String formule;
    private double value, valueMax;
    private UnitOfMeasure unitOfMeasure;


    public Component(String name, String formule, double value) {
        this.name = name;
        this.formule = formule;
        this.value = value;


    }

    public String getName() {
        return name;
    }

    public String getFormule() {
        return formule;
    }

    public double getValue() {
        return value;
    }
    public static void main(String[] args) {

    }
}

