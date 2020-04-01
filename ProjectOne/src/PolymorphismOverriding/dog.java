package PolymorphismOverriding;

public class dog extends animal{

	public void sound() {
	 	System.out.println(" I say bow bow");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d1 = new dog();
		
		d1.sound();
		
	}

}
