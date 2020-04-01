package Loops;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		int j = 1;
		String s[][]= new String[1][1];
		 
		s[0][0]="Java";
		s[1][1]="Selnium";
		s[0][1]="Python";
		s[1][0]="Devops";
		
		System.out.println(s[0][0]);
		
		do {
			System.out.println("Hello");
			i++;
			
		}while (i <=5);
			
		
			
			do {
				System.out.println("How are you");
				j=j+1;
				
			}while (j<=5);
			
		/*	do {
				
				System.out.println(s[0][0]);
				
			}while (i<5);*/
			
	}

}
