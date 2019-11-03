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
public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter first Value = ");
        a = input.nextInt();
        System.out.println("Emter Second Value");
        b = input.nextInt();
        c = a + b;
        int d = a * b;
        int e = a - b;
        System.out.println("sum =" + c);
        System.out.println("Product =+b");
        System.out.println("Diffrence =+e");

    }
}
