package DataTypes;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a two dimensional array of size [2][2] with a vaiable name "colours" and store the data and print

		String colours[][] = new String [2][2];
	
		
		
		colours[0][0] = "Blue";
		colours[0][1] = "Red";
		colours[1][1] = "Green";
		colours[1][1] = "Yellow";
		
		System.out.println("Favorite colors");
		System.out.println(colours[0][0]);
		System.out.println(colours[0][1]);
		System.out.println(colours[1][0]);
		System.out.println(colours[1][1]);
	}


}