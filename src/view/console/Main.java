package view.console;
import java.util.Scanner;
public class Main {
    // да, спасибо! хорошо) неа все понятно
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название удобрения: ");
        String fertilizerName = scanner.nextLine();

        System.out.print("Введите количество азота в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double nitrogen = scanner.nextDouble();

        System.out.print("Введите количество фосфора в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double phosphorus = scanner.nextDouble();

        System.out.print("Введите количество оксида фосфора в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double phosphorus_oxide = scanner.nextDouble();

        System.out.print("Введите количество серы в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double sulfur = scanner.nextDouble();

        System.out.print("Введите количество оксида фосфора в.раств. в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double phosphorus_oxide_v = scanner.nextDouble();

        System.out.print("Введите количество оксида фосфора ц.раств. в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double phosphorus_oxide_c = scanner.nextDouble();

        System.out.print("Введите количество оксида калия в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double potassium_oxide = scanner.nextDouble();

        System.out.print("Введите количество оксида магния в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double magnesium_oxide = scanner.nextDouble();

        System.out.print("Введите количество цинка в удобрении (в процентах), если вещества нет, то ставьте 0: ");
        double zincum = scanner.nextDouble();

        System.out.println("Вы ввели следующие данные:");

        System.out.println("Название удобрения: " + fertilizerName);
        System.out.println("Азот: " + nitrogen + "%");
        System.out.println("Фосфор: " + phosphorus + "%");
        System.out.println("Оксид фосфора: " + phosphorus_oxide + "%");
        System.out.println("Сера: " + sulfur + "%");
        System.out.println("Оксид фосфора в.раств.: " + phosphorus_oxide_v + "%");
        System.out.println("Оксид фосфора ц.раств: " + phosphorus_oxide_c + "%");
        System.out.println("Оксид калия: " + potassium_oxide + "%");
        System.out.println("Оксид магния: " + magnesium_oxide + "%");
        System.out.println("Цинк: " + zincum + "%");
        

        scanner.close();
    }
}
