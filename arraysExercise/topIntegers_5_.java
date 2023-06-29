package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers_5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < array.length; j++) {
                if (!(array[i] > array[j])) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                output.append(array[i]).append(" ");
            }
        }
        System.out.println(String.join(" ", output));
    }
}

