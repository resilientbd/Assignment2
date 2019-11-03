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
public class Task8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter ftrst Value");
        a = input.nextInt();
        System.out.println("Enter Second Value");
        b = input.nextInt();

        if (a > b) {
            System.out.println("first Value is greater");

        }

        if (a < b) {

            System.out.println("second is greater");
        }
        if (a == b) {

            System.out.println("the numbers are equal");
        }
    }

}
