package Inheritance;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog di = new Dog();
	
		di.run();
		di.sleep();
		di.sound();

	}
	public static void sound() {
		
		System.out.println("bow bow");
	}
}
