package assignment2;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your 1st number  : ");
        int num1 =scan.nextInt();
        
         System.out.print("enter your 2nd number  : ");
        int num2 =scan.nextInt();
        
        if(num1>num2){
        System.out.println("the subtractions number is "+(num1-num2));
        }
        else{
        System.out.println("the subtractions number is "+(num2-num1));
            
        }
    }

}
