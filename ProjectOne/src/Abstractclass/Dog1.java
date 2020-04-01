package Abstractclass;

public class Dog1 extends Animal1{

	public void sound() {
		
		System.out.println("bow bow");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog1 d1 = new Dog1();
		
		d1.sound();
		d1.walk();
		d1.sleep();
	}
 
	
}
