
package assignment2;

import java.util.Scanner;


public class Task7 {
    
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
        else
        {
            System.out.println("First is not greater");    
        }
        
        
    }
}
