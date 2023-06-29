package arraysExercise;

import java.util.Scanner;

public class zigZagArrays_3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArray[i - 1] = line[0];
                secondArray[i - 1] = line[1];
            } else {
                firstArray[i - 1] = line[1];
                secondArray[i - 1] = line[0];
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}