package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i [] = new int [4];
		
		   i [0] = 10;
		   i [1] = 20;
		   i [2] = 30;
		   i [3] = 40;
		   
		 
		
		System.out.println(i [0]);
		
		System.out.println(i.length);
		
		for(int  j = 0; j<4; j++ ) {
			
			System.out.println(i[j]);
			
			/* for (j = 0; j<i.length; j++){
			 * 
			 * system.out.println (i[j])
			 *}
			 */
		}
		
		double d [] = new double [3] ;
		       d [0] = 12.22;
		       d [1] = 20.10;
		       d [2] =  30.20;
		      
		       for (int j= 0 ; j<2; j++) {
		    	   System.out.println(d[j]);
		       }
		       
		      char c [] = new char [3];
		            c[0] = 'a';
		            c[1] = 'b';
		            c[2] = 'c';
		            
		       
		       
		           Object ob[] = new Object[3];
		           ob[0] = 12;
		           ob[1] = 'a';
		           ob[2] = "hi";
		           
		           System.out.println(ob[2]);
		           System.out.println(ob.length);
		           
		           for(int k = 0; k<ob.length; k++) {
		        	   System.out.println(ob[k]);
		           }
		           
		           
		           
		            
				
		
	}

	
}


