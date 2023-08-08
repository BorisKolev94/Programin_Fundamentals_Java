package listsLab;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndRevrse_7_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(number -> number < 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
        }
    }
}


