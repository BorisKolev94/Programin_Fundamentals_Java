package arraysExercise;

import java.util.Scanner;

public class train_1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] train = new int[n];
        for (int i = 0; i < train.length; i++) {
            train [i]= Integer.parseInt(scanner.nextLine());
        }
        int allPeople=0;
        for (int i = 0; i < train.length; i++) {
            allPeople+= train[i];
            System.out.print(train[i] + " ");
        }
        System.out.printf("\n%d", allPeople);
    }
}
