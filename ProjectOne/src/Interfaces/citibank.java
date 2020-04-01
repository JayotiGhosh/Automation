package Interfaces;

public class citibank implements centralbank {

	public void deposit() {
		
		System.out.println("Make deposit");
	}
	
	public void withdraw() {
		System.out.println("Make withdraw");
	}
	
	public void balance() {
		System.out.println("Print balance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		citibank c1 = new citibank();
		c1.withdraw();
		c1.deposit();
		c1.balance();
	}

}
