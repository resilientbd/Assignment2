
package assignment2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first value : ");
        a=input.nextInt();
        System.out.print("Enter Second value : ");
        b=input.nextInt();
        if(a>b){
            System.out.println("First is greater");
        }
        else if(a==b)
        {
            System.out.println("The number are equal");    
        }
        else
        {
            System.out.println("Second is greater");    
        }
        
        
    }

    
}
