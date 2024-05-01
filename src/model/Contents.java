package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contents {
    private String name;
    private String content;
    private String percentage;

    public Contents(String name, String content, String percentage) {
        this.name = name;
        this.content = content;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getPercentage() {
        return percentage;
    }


    public static void main(String[] args) {

    }
}
