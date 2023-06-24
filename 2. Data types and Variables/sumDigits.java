import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int n = Integer.parseInt(number);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.printf("%d", sum);
    }
}
