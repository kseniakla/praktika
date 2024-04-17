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
            List<Contents> contents = new ArrayList<>();
            contents.add(new Contents("Аммофос", "азот,оксид фосфора, сера, оксид магния","12, 52, 2.5, 0.5-0.8"));
            contents.add(new Contents("NPK(S)", "азот, оксид фосфора, оксид калия, сера, оксид магния","15, 15, 15, 10, 0.3-1")); //15:15:15:от10:от0.3 до1
            contents.add(new Contents("Сульфоаммофос", "азот, оксид фосфора, сера", "20, 20, 14")); //20:20:14
            contents.add(new Contents("Диаммофос", "азот, оксид фосфора, оксид калия, сера, оксид магния", "10-26, 26, 1-2, 0.3-1")); //от 10:от 26:от26:от 1 до 2:от 0.3 до1
            contents.add(new Contents("Аммиачная селитра", "азот", "34.4")); //от 34.4
            contents.add(new Contents("Моноаммонийфосфат", "азот, оксид фосфора", "12, 61")); //12:61
            contents.add(new Contents("Карбамид", "азот", "46.4")); //от 46.4
            contents.add(new Contents("ЖКУ", "азот, оксид фосфора", "11, 37")); //11:37
            contents.add(new Contents("Сульфат аммония", "азот, сера, оксид магния", "20.5, 22, 0.4-0.6")); //20,5: 22: 0.4-0.6


            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название удобрения: ");
            String input = scanner.nextLine();

            for (Contents content : contents) {
                if (content.getName().equalsIgnoreCase(input)) {
                    String[] parts = content.getPercentage().split(", ");
                    for (String part : parts) {
                        System.out.print(part + " ");
                    }
                    System.out.println();
                    return;
                }
            }
            System.out.println("Удобрение с таким названием не найдено в библиотеке программы.");
        }
    }
