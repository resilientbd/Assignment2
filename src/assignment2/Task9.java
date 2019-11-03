/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter ftrst Value");
        a = input.nextInt();
        System.out.println("Enter Second Value");
        b = input.nextInt();

        if (a > b) {

            System.out.println("the result is: " + (a - b));

        } else {
            System.out.println("the result is: " + (b - a));
        }

    }
}
