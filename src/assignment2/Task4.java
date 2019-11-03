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
public class Task4 {
    public static void main(String[] args) {
        System.out. println("Enter the Number a: ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        System.out. println("Enter the Number b: ");
        int b = in. nextInt();
        int c,d,e;
        c=a+b;
        d=a*b;
        e=a-b;
        System.out. println("The Sum is: "+c);
        System.out. println("The Product is: "+d);
        System.out. println("The Difference is: "+e);
        
    
    }
    
}
