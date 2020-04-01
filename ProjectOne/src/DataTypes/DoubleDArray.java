package DataTypes;

public class DoubleDArray{

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String names[][] = new String [2][2];
		
		names[0][1] = "Joy";
		names[1][1] = "Riya";
		names [1][0] = "Adam";
		names[0][0] = "G";
		
		System.out.println(names[0][1] + " " + names[0][0]);
		System.out.println(names[1][1] + " " + names[0][0]);
		System.out.println(names[1][0] + " " + names[0][0]);
		
		
	}
}