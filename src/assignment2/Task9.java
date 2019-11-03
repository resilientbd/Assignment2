package assignment2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        System.out.println("enter the number ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b) {
            c = a - b;
            System.out.println("the substract is " + c);
        }
            else 
    
            {
                    c=b-a;
                    
            
            System.out.println("the substract is  "+c);

        }
    }
}