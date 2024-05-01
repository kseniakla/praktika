package model;

public class Component {
    private String name;
    private String formule;
    private double value, valueMax;
    private UnitOfMeasure unitOfMeasure;


    public Component(String name, String formule, double value, double valueMax, UnitOfMeasure unitOfMeasure) {
        this.name = name;
        this.formule = formule;
        this.value = value;
        this.valueMax = valueMax;
        this.unitOfMeasure = unitOfMeasure;
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

    public double getValueMax() {
        return valueMax;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", formule='" + formule + '\'' +
                ", value=" + value +
                ", valueMax=" + valueMax +
                ", unitOfMeasure=" + unitOfMeasure +
                '}';
    }
}

