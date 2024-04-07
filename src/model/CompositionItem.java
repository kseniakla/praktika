package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompositionItem {
    public String name;
    public double value;

    public CompositionItem(String name, double value) {
        this.name = name;
        this.value = value;
    }
    public void DeliveryDate() {
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
