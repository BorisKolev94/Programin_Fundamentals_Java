package metodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperators_11_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        switch (symbol) {
            case "/":
                System.out.println(new DecimalFormat().format(mathOperatorsDecreese(num1, symbol,num2)));
                break;
            case "*":
                System.out.println(new DecimalFormat().format(mathOperatorsDecreeseAdd(num1, symbol,num2)));
                break;
            case"+":
            System.out.println(new DecimalFormat().format(mathOperatorsPlus(num1, symbol,num2)));
            break;
            case "-":
                System.out.println(new DecimalFormat().format(mathOperatorsMinus(num1, symbol,num2)));
                break;
        }
    }
    private static int mathOperatorsDecreese(int number1, String name, int number2) {
        int result = number1 / number2;
        return result;
    }
    private static int mathOperatorsDecreeseAdd(int number1, String name, int number2) {
        int result = number1 * number2;
        return result;
    }
    private static int mathOperatorsPlus(int number1, String name, int number2) {
        int result = number1 + number2;
        return result;
    }
    private static int mathOperatorsMinus(int number1, String name, int number2) {
        int result = number1 - number2;
        return result;
    }
}