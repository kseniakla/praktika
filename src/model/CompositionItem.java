package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompositionItem {
    public String name;
    public double value;
    public CompositionItem(String name, double value) {
        System.out.println("Введите название:"); // исправить на норм ввод-вывод ??
        this.name = name;
        System.out.println("Введите количество:");
        this.value = value;
    }
    public void DeliveryDate() {
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }

}
