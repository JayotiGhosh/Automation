package PolymorphismOverriding;

public class bmw extends Cars {
	 
	
	    public int speed()
	    {
	        return 150;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bmw b1= new bmw();
	
		b1.speedLimit();
		System.out.println("Speed limit is " + b1.speedLimit());
		

		int speed = b1.speed();
		// overriding 
		 System.out.println("BMW speed is " + speed + " mph");


	}

}
