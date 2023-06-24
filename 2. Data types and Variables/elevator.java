import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());

        double result = Math.ceil(n/p);

        System.out.printf("%.0f", result);
    }
}
