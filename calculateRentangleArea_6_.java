package metodsLab;

import java.util.Scanner;

public class calculateRentangleArea_6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(a, b);
        System.out.printf("%.0f", area);
    }
    private static double calculateRectangleArea(double a, double b) {
        return a * b;
    }
}
