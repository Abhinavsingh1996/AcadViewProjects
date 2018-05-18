
package acad_view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class10_PathOfFile_Abhinavsingh {
    	public static void main(String[] args) throws IOException {
		FileWriter out = null;
		System.out.println("Enter no. of paths"); 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int j=0;j<num;j++)
		{
		  System.out.println("Enter the path"); 
		  Scanner scan1 = new Scanner(System.in);
	      String path = scan1.nextLine().trim();
		  File file = new File(path);
		
		  String[] filename =file.list();
          File[] files = file.listFiles();

             try
              {   out = new FileWriter("abc.txt",true);
        	      for(int i=0;i<=filename.length;i++)
        	       {
        		System.out.println(filename[i]);
        		    out.write(filename[i] + "\n");	
                	}
        	}
             catch(Exception e)
             {
        	    System.out.println(e);
              }
             finally
              { if(out != null)
        	 out.close();
              }
        
		}
	}
    
}
