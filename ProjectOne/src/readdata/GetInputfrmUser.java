package readdata;
 import java.util.Scanner;
 
public class GetInputfrmUser {
	
	
	    public static void main(String args[])
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter name");
	        String s = in.nextLine();
	        System.out.println("You entered string "+s);
	        System.out.println("Enter age");
	        int a = in.nextInt();
	        System.out.println("Your age "+a);
	        System.out.println("Enter salary");
	        float b = in.nextFloat();
	        System.out.println("Your salary $ jayoti"+b);
	        in.close();
	    }
	}


