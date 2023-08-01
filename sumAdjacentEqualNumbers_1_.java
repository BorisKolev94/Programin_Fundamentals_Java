package listsLab;

import java.awt.*;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers_1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        //3 3 6 1 -> 6 6 1 -> 12 1

        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))){
                double sum = numberList.get(i) + numberList.get(i + 1);
                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = -1; //За да започваме отначало да проверяваме дали има равни индекси
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numberList) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}