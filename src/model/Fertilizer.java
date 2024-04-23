package model;

import java.util.ArrayList;
import java.util.List;

public class Fertilizer {
    private String name;
    private String space;

    //todo создать класс для состава где прописать процентное содержание каждого элемента
    //todo для анализа создать отдельный класс
    //todo сделать чтобы метод to string возвращал состав как на сайте фосагро
    private List<Component> componentList = new ArrayList<>();
    private String formule;

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