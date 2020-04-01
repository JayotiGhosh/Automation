package Encapsulation;

public class citibank  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralbank cent=new centralbank();
		
		cent.setinterest("pnb",12);
		cent.getinterest();
		
		cent.setinterest("citi",12);
		cent.getinterest();
		/*System.out.println(cent.interest);
		
		cent.interest=12;
		
		System.out.println(cent.interest);*/
		
	}

}
