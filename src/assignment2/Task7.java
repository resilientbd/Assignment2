
package assignment2;

import java.util.Scanner;


public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = myscan.nextInt();
        
        System.out.print("Enter 2nd Number : ");
        int num2 = myscan.nextInt();
        
        if(num1>num2){
            System.out.println("First Number is greater");
        }else{
            System.out.println("First Number is not greater");
        }
    }
    
}
