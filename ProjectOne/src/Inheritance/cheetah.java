package Inheritance;

public class cheetah extends Animal {
	
	Animal cheetah = new Animal();
	
	int eyes=2;
	int ears=2;
	int tail=1;
	int legs=4;
	String body="leapard print";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cheetah c1 = new cheetah();
		c1.run();
		c1.sleep();
		c1.sound();
	}
	

	public static void sound() {
		System.out.println("grrrrrr");
	}
}
