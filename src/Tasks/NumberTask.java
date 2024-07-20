package Tasks;

import java.util.Scanner;

public class NumberTask {
    public static void execute() {
        System.out.println("Задание 2.1");
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        float a = scan.nextInt();

        System.out.println("Введите второе число");
        float b = scan.nextInt();

        float sum = a + b;
        float diff = a - b;
        float multiply = a * b;
        float divider = a / b;

        System.out.println("Сравнение:");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Арифметические операции:");
        System.out.println("Сумма: " + sum + "\n" +
                "Разность: " + diff + "\n" +
                "Умножение: " + multiply + "\n" +
                "Деление: " + divider + "\n"
        );
    }
}