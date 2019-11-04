
package assignment2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        
        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = myscan.nextInt();
        
        if(num%2==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd");     
        }
    }
    
}
