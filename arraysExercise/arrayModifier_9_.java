package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier_9_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            // Perform the corresponding command
            switch (tokens[0]) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    array[index1] *= array[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i]--;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        // Print the modified array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}