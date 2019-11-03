/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String args[])
    {
       int a, b, c;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter The Two Numbers : ");
       a = scan.nextInt();
       b = scan.nextInt();
       c = a + b;
        System.out.println("sum = " +c);
        c = a * b;
        System.out.println("product = " +c);
       c = a - b;
        System.out.println("difference = " +c);
       
    }
    
}
