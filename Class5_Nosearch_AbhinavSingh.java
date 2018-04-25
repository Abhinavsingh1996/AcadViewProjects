
package acad_view;

import java.util.Scanner;


public class Class5_Nosearch_AbhinavSingh {
     public static void main(String args[])
       {
               
         System.out.println("Enter the  no elements in array");
         Scanner scan = new Scanner(System.in);
         int n= scan.nextInt();
           int arr[]=new int[n];
         System.out.println("Enter the elements of  array");
         for(int i=0;i<n;i++ )
           {
              arr[i]= scan.nextInt(); 
            
         }
          System.out.println("Enter the element to search");
          int k= scan.nextInt();
           int count =0;
          
           for(int j=0;j<n;j++ )
           {
               
               if(arr[j]==k)
               {
                   count=1;
                  
               }
           }
            if(count==1)
            {
                System.out.println("Element is found"); 
            }
            else
            {
                System.out.println("Element is not found"); 
            }
            
}
}
