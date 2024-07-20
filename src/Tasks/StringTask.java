package Tasks;

import java.util.Scanner;

public class StringTask {
    public static void execute() {
        System.out.println("Задание 2.2");
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String a = scan.nextLine();

        System.out.println("Введите вторую строку");
        String b = scan.nextLine();

        System.out.println("Сравнение:");

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}