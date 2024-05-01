package view.console;
import model.Component;
import model.UnitOfMeasure;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу управления удобрениями!");
        System.out.println("Выберите действие:");
        System.out.println("1. Посмотреть список удобрений");
        System.out.println("2. Ввести новое удобрение");
        System.out.println("3. Ввести актуальный состав удобрения");
        

        // todo вывести нач экран и на нем предложить посмотреть список удобрений/ввести новое/ввести актуальный состав
        Scanner scanner = new Scanner(System.in);
        String answer = "да";
        Controller controller = new Controller();

// todo добавить еще один цикл по вводу инф об удобрении

        while (answer.equals("да")) {
            System.out.print("Введите название компонента: ");
            String name = scanner.nextLine();

            System.out.print("Введите формулу компонента: ");
            String formule = scanner.nextLine();

            System.out.print("Введите значение: ");
            double value = scanner.nextDouble();

            System.out.print("Введите максимальное значение: ");
            double maxValue = scanner.nextDouble();

            System.out.print("Введите единицу измерения: ");
            String unitOfMeasure = scanner.nextLine();

            controller.addComponent(new Component(name, formule, value, maxValue,new UnitOfMeasure(unitOfMeasure)));

            System.out.print("Добавить компонент? (да/нет): ");
            answer = scanner.nextLine();
        }
    }
}

//сделать цикл while

        // введите по очереди
        // название компонента
        // формулу компонента
        // значение
        //макс значение
        // единица измерения
        //вызвать метод контроллера по добавлению компонента
        // в конце цикла "добавить компонент" ? ответ: да/нет

