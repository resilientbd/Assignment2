
package assignment2;

import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first Value = ");
        a=input.nextInt();
         System.out.print("Enter Second Value = ");
        b= input.nextInt();
        c=a+b;
        int d=a*b;
        int e=a-b;
        System.out.println("Sum = "+c);
        System.out.println("Product = "+d);
        System.out.println("Diffrence = "+e);
        
    }
    
}
