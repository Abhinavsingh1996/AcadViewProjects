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
public class Class9_SubString_AbhinaSingh {
      
    public static void main(String args[])
    {
        
       System.out.println("Enter the string");
       Scanner scan = new Scanner(System.in);
       String str= scan.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
        for (int j = i+1; j <= str.length(); j++) 
        {
         System.out.println(str.substring(i,j));
  
        }
       
       
    }
    
}
}
