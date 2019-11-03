
package assignment2;

import java.util.Scanner;


public class Task9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        a=input.nextInt();
        b=input.nextInt();
        if(a>b){
            c=a-b;
            System.out.println("Substract = "+c);
        }
        else if(b>a){
            c=b-a;
             System.out.println("Substract = "+c);
        }
        
    }
}
