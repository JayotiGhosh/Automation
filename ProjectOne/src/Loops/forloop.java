package Loops;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	for ( int i =1; i <=21; i++) {
			
			System.out.println("Java");
		
		}*/
			
			String name [] =new String [5];
			
			name[0] = "A";
			name[1] = "B";
			name[2]="c";
			name[3]="D";
			name[4]="E";
			
			for (int a=0; a<=4; a++)
			{
				System.out.println(name[a]);
			}
			
			String id[][] =new String [3][3];
			
			id[0][0] = "01";
			id [0][1] = "A";
			id [0][2] = "B";
			
			id[1][0] = "02";
			id [1][1] = "C";
			id [1][2] = "D";
			
			id [2][0] = "03";
			id [2][1] = "G";
			id [2][2] = "H";
			
						
				for ( int x=0; x<=2; x++ ){
					
			        for (int y=0; y<=2; y++ ) {
			        	
			        	System.out.println(id[x][y]);	
			        }
				}
				
			int x=0;
			
				System.out.println(id[x][0]+" "+id[0][x+1]+" "+id[0][x+2]);
			
				System.out.println(id[1][x]+" "+id[1][x+1]+" "+id[1][x+2]);
				
				System.out.println(id[2][x]+" "+id[2][x+1]+" "+id[2][x+2]);
				
				
			
	}

}
