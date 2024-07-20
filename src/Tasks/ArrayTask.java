package Tasks;

public class ArrayTask {
    public static void execute() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа:");
        
        for (int current : inputArray) {
            if (current % 2 == 0) {
                System.out.println(current);
            }
        }
    }
}