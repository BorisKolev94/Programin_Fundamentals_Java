package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train_1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vagoons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] token = command.split(" ");
            if (token[0].equals("Add")) {
                int passengers = Integer.parseInt(token[1]);
                vagoons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(token[0]);
                for (int i = 0; i < vagoons.size(); i++) {
                    int currentVagoon = vagoons.get(i);
                    if (currentVagoon + passengersToAdd <= capacity) {
                        vagoons.set(i, currentVagoon + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int vagon : vagoons) {
            System.out.print(vagon + " ");
        }
    }
}
