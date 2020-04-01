package Loops;

public class LoopsWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] student= new String[2][6];
		/*int[] studentage = new int
		studentname[0] = "Riya";
		studentname[1] = "Sriya";
		studentname[2] = "Priya";
		studentname[3] = "Diya";
		studentname[4] = "Piya";
		studentname[5] = "Jiya";*/
		
		student[0][0] = "Riya";
		student[0][1] = "Sriya";
		student[0][2] = "Priya";
		student[0][3] = "Diya";
		student[0][4] = "Piya";
		student[0][5] = "Jiya";
				
		student[1][0] = "21";
		student[1][1] = "18";
		student[1][2] = "16";
		student[1][3] = "12";
		student[1][4] = "15";
		student[1][5] = "27";
		
		 System.out.println("Students whose age is below 25");

		for (int x=0; x<=5; x++) {
			int age = 0;
		//	 names= "";	
			
				try {	
				age = Integer.parseInt(student[1][x]);
							//	names = student[x][1];
		 }catch(Exception e) {
             //names = "Invalid Age";	
				
		 }	
			      if(age<25){
			    	  	System.out.println(student[0][x]+" "+(age));
		             //    System.out.println(age);
		              
		             }
		}
	}
}
			//	System.out.println(numbers[y]);
			/*	if (student[1][y] = "25" != null ) {
						
					System.out.println(student[x][y]);

				}	*/							
	
	
