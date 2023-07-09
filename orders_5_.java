package metodsLab;

import java.util.Scanner;

public class orders_5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        calculateToralPrice( input,  quantity);
    }
    private static void calculateToralPrice(String input, int quantity) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;
        if (input.equals("coffee")) {
            price = quantity * 1.50;
        } else if (input.equals("water")) {
            price = quantity * 1.00;
        } else if (input.equals("coke")) {
            price = quantity * 1.40;
        } else if (input.equals("snacks")) {
            price = quantity * 2.00;
        }
        System.out.printf("%.2f", price);
    }
}
