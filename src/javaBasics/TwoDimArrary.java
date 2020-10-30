package javaBasics;

public class TwoDimArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x [][] = new String [2][3];
		System.out.println(x.length);// number of row
		System.out.println(x[0].length);// number of clumn
		
		       x[0][0] = "a";
		       x[0][1] = "b";
		       x[0][2] = "c";
		       
		      x [1][0] = "d";
		      x[1][1] = "e";
		      x[1][2] = "f";
		      
		      
		      for(int i=0; i<x.length; i++) {
		    	  for (int j = 0; j<x[0].length; j++){
		    		  System.out.println(x[i][j]);
		    		  
		    	  }
		      }
		      
		    	   
		       
				
		
	}

}
