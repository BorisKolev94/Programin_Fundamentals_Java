package methodsExercise;

import java.util.Scanner;

public class addAndSubtract_5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
       int result = sumNumbers(num1, num2, num3);
        System.out.println(result);
    }
    private static int sumNumbers (int num1, int num2, int num3){
        int sum = (num1+num2)-num3;
        return sum;

    }
}
