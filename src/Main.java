import model.Fertilizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // у нас есть список удобрений
        List<Fertilizer> fertilizers = new ArrayList<>();
        fertilizers.add(new Fertilizer("Удобрение 1", "Азотное", 0.2, 0.1, 0.3));
        fertilizers.add(new Fertilizer("Удобрение 2", "Фосфорное", 0.1, 0.3, 0.2));
        fertilizers.add(new Fertilizer("Удобрение 3", "Калийное", 0.3, 0.2, 0.1));

        //  запрос от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос (название элемента, содержание и диапазон в формате Элемент число-число):");
        String query = scanner.nextLine();

        String[] parts = query.split(" ");
        String element = parts[0];
        double minContent = -1;
        double maxContent = -1;
        if (parts.length == 2) {
            String[] range = parts[1].split("-");
            minContent = Double.parseDouble(range[0].replace("%", ""));
            maxContent = Double.parseDouble(range[1].replace("%", ""));
        }

        // фильтрация удобрений
        List<Fertilizer> filteredFertilizers = filterFertilizers(fertilizers, element, minContent, maxContent);

        // вывод результатов фильтрации
        System.out.println("Результаты поиска:");
        if (filteredFertilizers.isEmpty()) {
            System.out.println("Удобрения не найдены.");
        } else {
            for (Fertilizer fertilizer : filteredFertilizers) {
                System.out.println(fertilizer.getName() + " (" + fertilizer.getType() + "): Азот - " +
                        fertilizer.getNitrogenContent() + "%, Фосфор - " +
                        fertilizer.getPhosphorusContent() + "%, Калий - " +
                        fertilizer.getPotassiumContent() + "%");
            }
        }
    }
    // метод фильтрации удобрений по заданным характеристикам
    private static List<Fertilizer> filterFertilizers(List<Fertilizer> fertilizers, String element, double minContent, double maxContent) {
        List<Fertilizer> filteredFertilizers = new ArrayList<>();
        for (Fertilizer fertilizer : fertilizers) {
            if (element.equalsIgnoreCase("Азот")) {
                double nitrogenContent = fertilizer.getNitrogenContent();
                if ((minContent == -1 || nitrogenContent >= minContent) && (maxContent == -1 || nitrogenContent <= maxContent)) {
                    filteredFertilizers.add(fertilizer);
                }
            }
        }
        return filteredFertilizers;
    }
}