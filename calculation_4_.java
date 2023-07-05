package metodsLab;

import java.util.Scanner;

public class calculation_4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        if (command.equals("add")){
            add(num1, num2);
        }else if (command.equals("multiply")){
            multiply(num1, num2);
        } else if (command.equals("subtract")) {
            subtract(num1, num2);
        } else if (command.equals("divide")) {
            divide(num1, num2);
        }
    }
    private static void add (int num1, int num2){
        int num3 =  num1 +  num2;
        System.out.println(num3);}
    private static void multiply (int num1, int num2){
        int num3 =  num1 *  num2;
        System.out.println(num3);}
    private static void subtract (int num1, int num2){
        int num3 =  num1 -  num2;
        System.out.println(num3);}
    private static void divide (int num1, int num2){
        int num3 =  num1 /  num2;
        System.out.println(num3);}
    }

