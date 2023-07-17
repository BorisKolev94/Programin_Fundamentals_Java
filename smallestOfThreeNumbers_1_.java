package methodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class smallestOfThreeNumbers_1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1= Integer.parseInt(scanner.nextLine());
        int num2= Integer.parseInt(scanner.nextLine());
        int num3= Integer.parseInt(scanner.nextLine());
        int smallestNumber = printSmallestNumber(num1, num2, num3);
        System.out.println(smallestNumber);
    }
    private static int printSmallestNumber (int num1, int num2, int num3){
        int [] numbers= {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers[0];
    }
}
