
package acad_view;

import java.util.Scanner;

public class Leap_Year {
        public static void main (String args[])
    {
        
        System.out.println("Enter the you want to is leap year or not");
        Scanner scan = new Scanner(System.in);
        int y = scan .nextInt();
        if(y%4==0)
        {
            
            System.out.println("The entered year is leap year");
            
        }
        else
        {
             System.out.println("The entered year is leap year");
        }
    }
    
    
}
