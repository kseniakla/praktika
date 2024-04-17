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
        String fertilizerName = scanner.nextLine();

        List<Component> components = new ArrayList<>();
        components.add(new Component("азот", "N", 12)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 52)); // ?
        components.add(new Component("сера", "S", 2.5)); // от 2.5
        components.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components.add(new Component("оксид магния", "MgO", 0.1 - 0.6)); // %
        components.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        Fertilizer ammophous = new Fertilizer("аммофос", " ", components);

        components.add(new Component("азот", "N", 15)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 15)); // %
        components.add(new Component("оксид калия", "K₂O", 15)); // %
        components.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components.add(new Component("сера", "S", 10)); // от 10
        components.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        Fertilizer NPK_S = new Fertilizer("NPK(S)", " ", components);

        components.add(new Component("азот", "N", 20)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 20)); // %
        components.add(new Component("оксид магния", "MgO", 0.1 - 0.3)); // %
        components.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); //%
        components.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components.add(new Component("сера", "S", 14)); //%
        components.add(new Component("цинк", "Zn", 0.4)); //%
        Fertilizer sulfoammophos = new Fertilizer("Сульфоаммофос", " ", components);

        components.add(new Component("азот", "N", 10)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        components.add(new Component("оксид калия", "K₂O", 26)); // %
        components.add(new Component("оксид фосфора в.раств.", "P₂O₅", 90)); // %
        components.add(new Component("оксид фосфора ц.раств.", "P₂O₅", 95)); // %
        components.add(new Component("оксид магния", "MgO", 0.3 - 1)); // %
        components.add(new Component("сера", "S", 2)); //%
        Fertilizer diammophos = new Fertilizer("Диаммофос", " ", components);

        components.add(new Component("азот", "N", 34.4)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 26)); // %
        Fertilizer ammonium_nitrate = new Fertilizer("Аммиачная селитра", "", components);

        components.add(new Component("азот", "N", 12)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 61)); // %
        Fertilizer monoammonium_phosphate = new Fertilizer("Моноаммонийфосфат", "", components);

        components.add(new Component("азот", "N", 46.4)); // от 46.4
        Fertilizer urea = new Fertilizer("Карбамид", "", components);

        components.add(new Component("азот", "N", 11)); // %
        components.add(new Component("оксид фосфора", "P₂O₅", 37)); // %
        Fertilizer ammonium_polyphosphate = new Fertilizer("ЖКУ", "", components);

        components.add(new Component("азот", "N", 20.5)); // %
        components.add(new Component("сера", "S", 26)); // %
        components.add(new Component("оксид магния", "MgO", 0.4 - 0.6)); // %
        Fertilizer ammonium_sulfate = new Fertilizer("Сульфат аммония", "", components);


        for (Component component : components) {
            if (!component.getName().equalsIgnoreCase(input)) {
                continue;
            }
            System.out.println("Полный состав удобрения " + component.getName() + ": " + component.getFormule() + component.getValue());
            return;
        }

        System.out.println("Удобрение с таким названием не найдено.");
    }
}