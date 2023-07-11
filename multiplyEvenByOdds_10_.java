package metodsLab;
import java.util.Scanner;
public class multiplyEvenByOdds_10_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result= getMultipleOfEvenAndOdds(Math.abs(n));
        System.out.println(result);
    }
    private static int getMultipleOfEvenAndOdds(int n) {
        int even = 0;
        int odd = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even+=digit;
            } else {
                odd+=digit;
            }
            n = n / 10;
        }
        return even*odd;
    }
}
