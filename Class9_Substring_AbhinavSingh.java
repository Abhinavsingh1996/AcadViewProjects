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
public class Class9_Substring_AbhinavSingh {
      
    public static void main(String args[])
    {
        
       System.out.println("Enter the string");
       Scanner scan = new Scanner(System.in);
       String str= scan.nextLine();
       char ch[]=str.toCharArray();
        System.out.println("Enter the Substring");
        String sub= scan.nextLine();
        char che[]=sub.toCharArray();
        for( int i= 0; i<ch.length;i++)
        {
            for(int j= i+1; i<  che.length;j++)
            {
              if(ch[i]==che[j])
                  
              {
                  i++;
                  j++;
                  
                       
              }
              else  
              {
                  j++;
              }
            }
           System.out.println();
           }
      }}
