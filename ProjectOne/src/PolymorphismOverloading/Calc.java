package PolymorphismOverloading;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1 = new Calc();
		c1.add(10, 20);
		c1.add(5, 5, 5);
		c1.add(25, 25, 25, 25);
		}

	public void add (int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void add (int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
}
	public void add (int a, int b, int c, int d) {
		int e = a+b+c+d;
		System.out.println(e);
}
	
}