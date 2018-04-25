
package acad_view;

import java.util.Scanner;

public class Palindrome {
      public static void main(String args[])
    {
        System.out.println("Enter the no");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int orig=n;
         int rev=0;
        while(n!=0)
        {
          rev= rev *10;
          rev=rev + n%10;
          n=n/10;
            }
        
        if(orig== rev)
        {
          
        System.out.println("Entered no is palindrome");
        }
        else
        {
           System.out.println("Entered not a is palindrome");  
        }
        

    }
    
}
