package methodsExercise;

import java.util.Scanner;

public class middleCharacte_6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleOfAString(input);
    }
    private static void middleOfAString(String input) {
        if (input.length() % 2 != 0) {
            int middleElement = input.length() / 2;
            System.out.println(input.charAt(middleElement));
        } else  {
            int firstMidlleElemen = input.length() / 2 - 1;
            int secondMidlleElemen = input.length() / 2;
            System.out.printf("%c%c", input.charAt(firstMidlleElemen), input.charAt(secondMidlleElemen));
        }


    }
}
