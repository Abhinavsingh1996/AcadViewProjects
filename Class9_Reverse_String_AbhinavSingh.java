/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acad_view;

import java.util.Scanner;

/**
 *
 * @author Abhinav
 */
public class Class9_Reverse_String_AbhinavSingh {
    
    public static void main(String args[])
    {
        
       System.out.println("Enter the string");
       Scanner scan = new Scanner(System.in);
       String str= scan.nextLine();
       System.out.println(str);
       char ch[]=str.toCharArray();  
      
        String rev= "";
      for(int i=ch.length-1;i>=0;i--)
       {    
           
            rev= rev+ch[i];
       }
           
        System.out.println(rev);
    }
    
}
