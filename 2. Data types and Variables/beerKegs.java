import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beers = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String winMode = "";

        for (int i = 0; i < beers; i++) {
            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(r, 2) * h;
            if (volume > maxVolume) {
                maxVolume = volume;
                winMode = model;
            }
        }
        System.out.println(winMode);
    }
}
