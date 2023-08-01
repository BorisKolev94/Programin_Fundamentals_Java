package listsLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists_3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> num2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int smallListSize = Math.min(num1.size(), num2.size());
        for (int i = 0; i < smallListSize; i++) {
            System.out.print(num1.get(i) + " " + num2.get(i) + " ");
        }
        printTheRest(num1, smallListSize);
        printTheRest(num2, smallListSize);
    }

    private static void printTheRest(List<Integer> list, int beginIndex) {
        for (int i = beginIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

