package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int element = Integer.parseInt(command.split("\\s+")[1]);
            switch (tokens[0]) {
                case "Delete":
                    integers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command.split("\\s+")[2]);
                    integers.add(index, element);
            }
            command = scanner.nextLine();
        }
        printList(integers);
    }
        private static void printList (List<Integer> integers) {
            for (int number : integers) {
                System.out.print(number + " ");
            }
        }
    }