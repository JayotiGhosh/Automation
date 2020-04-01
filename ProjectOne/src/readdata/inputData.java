package readdata;

import java.util.Scanner;

public class inputData {

	
		    public static void main(String args[])
		    {
		        Scanner in = new Scanner(System.in);
		        System.out.println("enter you name ");
		        String s = in.nextLine();
		        System.out.println("your name is "+s);
		        
		         System.out.println("enter your age ");
		        int a = in.nextInt();
		        System.out.println("your age is "+a);
		        
		        in.close();
		    }



	}


