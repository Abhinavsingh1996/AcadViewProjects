
package acad_view;

import java.util.Scanner;

public class LargestNo {
    
     
    
    public static void main(String args[]){
    System.out.println("Enter three no");
    Scanner scan = new Scanner(System.in); 
    int a = scan.nextInt();
     int b = scan.nextInt();
      int c = scan.nextInt();
     
      if(a>b&&a>c)
         {
             System.out.println("The largest no is"+a );
             
         }
             else if(c>a&&c>b)
         {
             System.out.println("The largest no is"+c);
             
      }
      else
             {
                   System.out.println("The largest no is"+b);
             }
      
      
    }
}
