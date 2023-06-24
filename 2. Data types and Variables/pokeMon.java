import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int pokes = 0;
        double halfN = N * 0.50;

        while (N >= M) {
            N -= M;
            pokes++;
            if (N == halfN && Y != 0) {
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(pokes);
    }
}
