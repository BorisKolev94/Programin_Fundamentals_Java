package metodsLab;

import java.util.Scanner;

public class singOfInteger_1_ {
    static void printSignOfAnInteger (int number) {
        if (number<0){
            System.out.printf("The number %d is negative.", number);
        } else if (number==0) {
            System.out.printf("The number %d is zero.", number);
        }else if (number>0){
            System.out.printf("The number %d is positive.", number);
        }

    }
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      printSignOfAnInteger(scanner.nextInt());


    }
}