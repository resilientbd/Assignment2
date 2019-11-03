
package assignment2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = s.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println("The Subtractions of the numbers is " + (num1 - num2));
        } else {
            System.out.println("The Subtractions of the numbers is " + (num2 - num1));
        }
    }
}
