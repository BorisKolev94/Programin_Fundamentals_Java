package methodsExercise;

import java.util.Scanner;

public class vowelsCount_2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printCountNumberOfVowel(input);
    }
    private static void printCountNumberOfVowel(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.toLowerCase().charAt(i);
                if (symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117 || symbol == 121) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

