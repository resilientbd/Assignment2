
package assignment2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = s.nextInt();
        
        System.out.print("Enter 2nd Number : ");
        int num2 = s.nextInt();
        
        if(num1>num2){
            System.out.println("First Number is greater");
        }else if(num2>num1){
            System.out.println("Second Number is greater");
        }else{
            System.out.println("The Numbers are Equal");
        }
    }
    
}
