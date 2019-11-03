package assignment2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c,d,e,f;
        
        System.out.print("Enter 1st Number = ");
        a = input.nextInt();
        System.out.print("Enter 2nd Number = ");
        b = input.nextInt();
        c = a+b;
        d = a*b;
        e = a-b;
        f = a/b;
        System.out.println("Sum = " + c);
        System.out.println("product = " + d);
        System.out.println("difference = " + e);
        System.out.println("div = " + f);
    }
}
