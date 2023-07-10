package metodsLab;

import java.util.Scanner;

public class repeatStrings_7_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String repeatString = repeatString(input, n);
        System.out.println(repeatString);
    }

    private static String repeatString(String input, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + input;
        }
        return result;
    }
}
