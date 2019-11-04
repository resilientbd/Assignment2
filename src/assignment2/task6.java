package assignment2;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your 1st number  : ");
        int num1 =scan.nextInt();
        
         System.out.print("enter your 2nd number  : ");
        int num2 =scan.nextInt();
        
        if(num1>num2){
        System.out.println("sum of this 2 num: "+num1);
        }
    }

}
