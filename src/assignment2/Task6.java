
package assignment2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = s.nextInt();
        
        System.out.print("Enter 2nd Number : ");
        int num2 = s.nextInt();
        
        if(num1>num2){
            System.out.println("1st Number is : "+num1);
        }
    }
    
}
