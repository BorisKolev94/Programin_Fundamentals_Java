package arraysExercise;

import java.util.Scanner;

public class arrayRotation_4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotations; i++) {
            String firstElement = array[0];
            //Swift all elements without the first, one position to the  left
            for (int j = 0; j <array.length-1 ; j++) {
                array[j]= array[j+1];
            }
            // Add first element to the last position
            array[array.length-1]=firstElement;
        }
        System.out.println(String.join(" ", array));
    }
}
