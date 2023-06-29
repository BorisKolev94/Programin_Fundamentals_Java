package arraysExercise;

import java.util.Scanner;

public class commonElements_2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstElements = scanner.nextLine().split(" ");
        String[] secondElements = scanner.nextLine().split(" ");

        for (String second : secondElements) {
            for (String first : firstElements) {
                if (second.equals(first)) {
                    System.out.print(second + " ");
                }

            }

        }
    }
}
