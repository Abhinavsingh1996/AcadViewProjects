/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acad_view;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author Abhinav
 */
public class Class9_WordCount_AbhinavSingh {
      public static void main(String args[])
    {
        int count =0;
       System.out.println("Enter the string");
       Scanner scan = new Scanner(System.in);
       String str= scan.nextLine();
       for (int i = 0; i < str.length(); i++) 
        {
            count++;
            
        }
       System.out.println(count);
       
    
    
    }
    
}
