
package acad_view;

import java.util.Scanner;


public class Reverse_No {
      public static void main( String args[])
    {
        System.out.println("Enter the no");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int rev=0;
        while(n!=0)
        {
          rev= rev *10;
          rev=rev + n%10;
          n=n/10;
            }
        System.out.println("Reverse of no is"+rev );
        
       }
    
}
