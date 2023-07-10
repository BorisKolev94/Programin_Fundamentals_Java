package metodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower_8_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double n1 = Double.parseDouble(scanner.nextLine());
       int n2 = Integer.parseInt(scanner.nextLine());
       double result2 = mathPower(n1, n2);
        System.out.printf(new DecimalFormat("0.####").format(mathPower(n1, n2)));

    }
    private static double mathPower (double n1, int n2) {
        double result = Math.pow(n1, n2);

        return result;
    }
}
