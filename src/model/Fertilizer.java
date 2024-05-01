package model;

import java.util.ArrayList;
import java.util.List;

public class Fertilizer {
    private String name;
    private String space;

    //todo для анализа создать отдельный класс
    //хорошо спасибо!!
    private List<Component> componentList = new ArrayList<>();
    private String formule;

    @Override
    public String toString() {
        return "Fertilizer{" +
                "name='" + name + '\'' +
                ", space='" + space + '\'' +
                ", componentList=" + componentList +
                ", formule='" + formule + '\'' +
                '}';
    }

    public Fertilizer(String name, String space, List<Component> componentList) {
        this.name = name;
        this.space = space;
        this.componentList = componentList;
    }

    public String getName() {
        return name;
    }
    public String getSpace() {
        return space;
    }
    public List<Component> getComponentList(){ return componentList; }

    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }
}