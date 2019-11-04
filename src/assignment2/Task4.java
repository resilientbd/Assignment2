/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Enter first value = ");
        a=input.nextInt();
        System.out.print("Enter Second value = ");
        b=input.nextInt();
        
        c=a+b;
        
        int d=a*b;
        int e=a-b;
        System.out.println("Sum = "+c);
        System.out.println("product = "+d);
        System.out.println("Diffrence = "+e);
        
        
    }
    
}
