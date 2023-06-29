package arraysLab;

import java.util.Scanner;

public class spaceRemovalFromTheBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();
        for (int i = 0; i < mostFamous.length(); i++) {
            char current = mfl[i];
            if (current != ' ') {
                System.out.print(current);
            }else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
