/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author AMITABH
 */
public class Task9 {
    public static void main(String[] args) {
    System.out. println("Enter the Number a: ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        System.out. println("Enter the Number b: ");
        int b = in. nextInt();
        if (a>b)
        {
        System.out. println(" first number is greater  ");
        int c;
        c=a-b;
        System.out. println(" Result "+c);
        }
        else
        {
          System.out. println(" second number is greater: ");
          int c=b-a;
          System.out. println(" Result "+c);
        }
    
    }
}
