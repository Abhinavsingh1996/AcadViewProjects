
package acad_view;

import java.util.Scanner;

public class Prime_no {
        public static void main(String args[])
    { 
        int value = 0;
        System.out.println("Enter the no ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
       int  m=n/2;
        if(n==0||n==1)
        {
              System.out.println("It is not prime no"); 
            
        }
        else{
            
            for(int i=2;i<=m;i++)
            {
            if(n%i==0)
              {
                System.out.println("It is not prime no");
               value =1;
                break;
                
              }
            
        }
            if(value==0)
            {
                System.out.println("It is  prime no");
                
            }
            
        
        
    }
}
    
}
