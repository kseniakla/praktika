package view.test;

import model.Component;
import model.Fertilizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String input;
    private String name;
    private String formule;
    private double value;
    private double maxValue;
    private String UnitOfMeasure;
    @Override
    public String toString() {
        return "Component{" +
                "название ='" + name + '\'' +
                ", формула ='" + formule + '\'' +
                ", количество ='" + value + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название удобрения:");
        String componentName = scanner.nextLine();

        List<Fertilizer> fertilizers = new ArrayList<>();
        List<Component> components1 = new ArrayList<>();
        components1.add(new Component("азот", "N", 12, 14)); // %
        components1.add(new Component("оксид фосфора", "P₂O₅", 52)); // ?
        components1.add(new Component("сера", "S", 2.5)); // от 2.5
        components1.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components1.add(new Component("оксид магния", "MgO", 0.1 - 0.6)); // %
        components1.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        Fertilizer fertilizer = new Fertilizer("аммофос", " ", components1);
        fertilizers.add(fertilizer);

        List<Component> components2 = new ArrayList<>();
        components2.add(new Component("азот", "N", 15)); // %
        components2.add(new Component("оксид фосфора", "P₂O₅", 15)); // %
        components2.add(new Component("оксид калия", "K₂O", 15)); // %
        components2.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components2.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components2.add(new Component("сера", "S", 10)); // от 10
        components2.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        fertilizer = new Fertilizer("NPK(S)", " ", components2);
        fertilizers.add(fertilizer);

        List<Component> components3 = new ArrayList<>();
        components3.add(new Component("азот", "N", 20)); // %
        components3.add(new Component("оксид фосфора", "P₂O₅", 20)); // %
        components3.add(new Component("оксид магния", "MgO", 0.1 - 0.3)); // %
        components3.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components3.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components3.add(new Component("сера", "S", 14)); //%
        components3.add(new Component("цинк", "Zn", 0.4)); //%
        fertilizer = new Fertilizer("Сульфоаммофос", " ", components3);
        fertilizers.add(fertilizer);

        List<Component> components4 = new ArrayList<>();
        components4.add(new Component("азот", "N", 10)); // %
        components4.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        components4.add(new Component("оксид калия", "K₂O", 26)); // %
        components4.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components4.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components4.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        components4.add(new Component("сера", "S", 2)); //%
        fertilizer = new Fertilizer("Диаммофос", " ", components4);
        fertilizers.add(fertilizer);

        List<Component> components5 = new ArrayList<>();
        components5.add(new Component("азот", "N", 34.4)); // %
        components5.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        fertilizer = new Fertilizer("Аммиачная селитра", "", components5);
        fertilizers.add(fertilizer);

        List<Component> components6 = new ArrayList<>();
        components6.add(new Component("азот", "N", 12)); // %
        components6.add(new Component("оксид фосфора", "P₂O₅", 61)); // %
        fertilizer = new Fertilizer("Моноаммонийфосфат", "", components6);
        fertilizers.add(fertilizer);

        List<Component> components7 = new ArrayList<>();
        components7.add(new Component("азот", "N", 46.4)); // от 46.4
        fertilizer = new Fertilizer("Карбамид", "", components7);
        fertilizers.add(fertilizer);

        List<Component> components8 = new ArrayList<>();
        components8.add(new Component("азот", "N", 11)); // %
        components8.add(new Component("оксид фосфора", "P₂O₅", 37)); // %
        fertilizer = new Fertilizer("ЖКУ", "", components8);
        fertilizers.add(fertilizer);

        List<Component> components9 = new ArrayList<>();
        components9.add(new Component("азот", "N", 20.5)); // %
        components9.add(new Component("сера", "S", 26)); // %
        components9.add(new Component("оксид магния", "MgO", 0.4 - 0.6)); // %
        fertilizer = new Fertilizer("Сульфат аммония", "", components9);
        fertilizers.add(fertilizer);

        for (Fertilizer fertilizer1 : fertilizers) {
            if (fertilizer1.getName().equalsIgnoreCase(componentName)) {
                System.out.println("Состав удобрения " + fertilizer1.getName() + ":");
                for (Component component : fertilizer1.getComponentList()) {
                    System.out.println(component.getName() + ": " + component.getValue() + "%");
                }

            }
        }
    }
}