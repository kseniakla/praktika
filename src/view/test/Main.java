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
        components1.add(new Component("азот", "N", 12)); // %
        components1.add(new Component("оксид фосфора", "P₂O₅", 52)); // ?
        components1.add(new Component("сера", "S", 2.5)); // от 2.5
        components1.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components1.add(new Component("оксид магния", "MgO", 0.1 - 0.6)); // %
        components1.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        Fertilizer ammophous = new Fertilizer("аммофос", " ", components1);
        fertilizers.add(ammophous);

        List<Component> components2 = new ArrayList<>();
        components2.add(new Component("азот", "N", 15)); // %
        components2.add(new Component("оксид фосфора", "P₂O₅", 15)); // %
        components2.add(new Component("оксид калия", "K₂O", 15)); // %
        components2.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components2.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components2.add(new Component("сера", "S", 10)); // от 10
        components2.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        Fertilizer NPK_S = new Fertilizer("NPK(S)", " ", components2);
        fertilizers.add(NPK_S);

        List<Component> components3 = new ArrayList<>();
        components3.add(new Component("азот", "N", 20)); // %
        components3.add(new Component("оксид фосфора", "P₂O₅", 20)); // %
        components3.add(new Component("оксид магния", "MgO", 0.1 - 0.3)); // %
        components3.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components3.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components3.add(new Component("сера", "S", 14)); //%
        components3.add(new Component("цинк", "Zn", 0.4)); //%
        Fertilizer sulfoammophos = new Fertilizer("Сульфоаммофос", " ", components3);
        fertilizers.add(sulfoammophos);

        List<Component> components4 = new ArrayList<>();
        components4.add(new Component("азот", "N", 10)); // %
        components4.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        components4.add(new Component("оксид калия", "K₂O", 26)); // %
        components4.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components4.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components4.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        components4.add(new Component("сера", "S", 2)); //%
        Fertilizer diammophos = new Fertilizer("Диаммофос", " ", components4);
        fertilizers.add(diammophos);

        List<Component> components5 = new ArrayList<>();
        components5.add(new Component("азот", "N", 34.4)); // %
        components5.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        Fertilizer ammonium_nitrate = new Fertilizer("Аммиачная селитра", "", components5);
        fertilizers.add(ammonium_nitrate);

        List<Component> components6 = new ArrayList<>();
        components6.add(new Component("азот", "N", 12)); // %
        components6.add(new Component("оксид фосфора", "P₂O₅", 61)); // %
        Fertilizer monoammonium_phosphate = new Fertilizer("Моноаммонийфосфат", "", components6);
        fertilizers.add(monoammonium_phosphate);

        List<Component> components7 = new ArrayList<>();
        components7.add(new Component("азот", "N", 46.4)); // от 46.4
        Fertilizer urea = new Fertilizer("Карбамид", "", components7);
        fertilizers.add(urea);

        List<Component> components8 = new ArrayList<>();
        components8.add(new Component("азот", "N", 11)); // %
        components8.add(new Component("оксид фосфора", "P₂O₅", 37)); // %
        Fertilizer ammonium_polyphosphate = new Fertilizer("ЖКУ", "", components8);
        fertilizers.add(ammonium_polyphosphate);

        List<Component> components9 = new ArrayList<>();
        components9.add(new Component("азот", "N", 20.5)); // %
        components9.add(new Component("сера", "S", 26)); // %
        components9.add(new Component("оксид магния", "MgO", 0.4 - 0.6)); // %
        Fertilizer ammonium_sulfate = new Fertilizer("Сульфат аммония", "", components9);
        fertilizers.add(ammonium_sulfate);
//
        for (Fertilizer fertilizer : fertilizers) {
            if (fertilizer.getName().equalsIgnoreCase(componentName)) {
                System.out.println("Состав удобрения " + fertilizer.getName() + ":");
                for (Component component : fertilizer.getComponentList()) {
                    System.out.println(component.getName() + ": " + component.getValue() + "%");
                }

            }
        }
    }
}