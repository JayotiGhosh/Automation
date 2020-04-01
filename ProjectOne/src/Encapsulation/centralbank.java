package Encapsulation;

public class centralbank {
	
	 private int interest=10;
	
	 public void setinterest (String bankname, int interest1) {
	 
	 if (bankname=="citi") {
		 
		// int interest1=11;
		 interest=interest1;
		 
	 }}
	 
	 
	 public  void getinterest() {
		 
		 System.out.println(interest);
	 }

}