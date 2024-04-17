package model;

import java.util.List;

public class Fertilizer {
    private String name;
    private String space;

    //todo создать класс для состава где прописать процентное содержание каждого элемента
    //todo для анализа создать отдельный класс
    //todo сделать чтобы метод to string возвращал состав как на сайте фосагро
    private List<Component> componentList;

    public Fertilizer(String name, String space, List<Component> components) {
    }

    public String getName() {
        return name;
    }
    public String getSpace() {
        return space;
    }
    public List<Component> getComponentList(){ return componentList; }


}