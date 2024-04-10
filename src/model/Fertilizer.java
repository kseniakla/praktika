package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fertilizer {
    private String name;
    private String type;
//todo создать класс компонент с назв. и сод., созд класс для состава
    //todo для анализа создать отдельный класс
    private double nitrogenContent;
    private double phosphorusContent;
    private double potassiumContent;

    public Fertilizer(String name, String type, double nitrogenContent, double phosphorusContent, double potassiumContent) {
        this.name = name;
        this.type = type;
        this.nitrogenContent = nitrogenContent;
        this.phosphorusContent = phosphorusContent;
        this.potassiumContent = potassiumContent;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getNitrogenContent() {
        return nitrogenContent;
    }

    public double getPhosphorusContent() {
        return phosphorusContent;
    }

    public double getPotassiumContent() {
        return potassiumContent;
    }
}