package DataTypes;

public class SingleDArray_nonprimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Create a single dimensional array of size 5 with variable name "personNames" and store the data and print 

		int value[] = new int[3];
		String personNames[] = new String [5];
		
		value[0]=100;
		value[1]=101;
		value[2]=105;
		
		 personNames[0] = "Sriya";
		 personNames[1] = "Sreya";
		 personNames[2] = "Medha";
		 personNames[3] = "Mishti";
		 personNames[4] = "Ananya";
		 
		
		System.out.println("A-"+" " + "=" + " " +  value[0]);
		System.out.println("A" +" " + "=" + " " + value[1]);
		System.out.println("A+"+" " + "=" + " " +  value[2]);
		
		System.out.println (personNames[0]+ " " +value[0] + " "+"%");
		System.out.println (personNames[1]+" "+value[2] + " "+"%");
		System.out.println (personNames[2]+" "+value[1] + " "+"%");
		System.out.println	(personNames[3]+" "+value[0] + " "+"%");
		System.out.println (personNames[4]+" "+value[1] + " "+"%");
	}

}
