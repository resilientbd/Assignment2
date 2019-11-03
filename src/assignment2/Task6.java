package assignment2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first Value: ");
        a = input.nextInt();
        System.out.println("Enter first Value: ");
        b = input.nextInt();
        if (a > b) {
            System.out.println("First");

        } else {
            System.out.println("Second");
        }
    }

}
