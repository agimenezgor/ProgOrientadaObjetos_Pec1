package edu.uoc.errors;

public class DPOO_UOC {

	 public static void main(String[] args){
		String errorFormatCmd = "Format error: java UOC_DPOO <int>",
				DPOO = "DPOO",
				UOC = "UOC";		 
		
	    if(args.length==0) {
	    	System.out.println(errorFormatCmd);
	    }else {
	    	int num = Integer.parseInt(args[0]);
	    	
	    	for (int i = 1; i <= num; i++){
	            if (((i % 5) == 0) && ((i % 7) == 0)) 
	                System.out.println(DPOO+UOC);
	            else if ((i % 5) == 0) 
	                System.out.println(DPOO);
	            else if ((i % 7) == 0)
	                System.out.println(UOC);
	            else
	                System.out.println(i); 
	        }
	    }	    
	 }	
}