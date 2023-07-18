package methodsExercise;

import java.util.Scanner;

public class charactersInRange_3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        printAllSymbolsBetweenTwoCharachterInASCII(start, end);
    }

    private static void printAllSymbolsBetweenTwoCharachterInASCII(char start, char end) {
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
