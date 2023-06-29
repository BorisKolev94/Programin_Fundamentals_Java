package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements_7_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLenght = 0;
        int lenght = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                lenght++;
            } else {
                lenght = 1;
                startIndex = i;
            }
            if (lenght > maxLenght) {
                maxLenght = lenght;
                bestStart = startIndex;
            }
        }
            for (int i = bestStart; i <bestStart+maxLenght ; i++) {
                System.out.print(array[i]+ " ");
            }
        }
    }

