import Tasks.ArrayTask;
import Tasks.NumberTask;
import Tasks.StringTask;

import java.util.Scanner;

public class Main {
    /**
     * В задании не проверялась корректность ввода данных
     * Если необходимо - то возможно добавить
     */
    public static void main(String[] args) {
        System.out.println("Введите номер задания (1, 2 или 3)");
        Scanner scan = new Scanner(System.in);
        int taskNumber = scan.nextInt();

        if (taskNumber == 1) {
            NumberTask.execute();
        }
        else if (taskNumber == 2) {
            StringTask.execute();
        }
        else if (taskNumber == 3) {
            ArrayTask.execute();
        }
    }
}
