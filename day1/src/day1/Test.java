package day1;

public class Test {

	public static void main(String[] args) {
		
		String s="5 1 9 5\n" + 
				"7 5 3  ";
		//System.out.println(s);
		int m,n;
		String[] s1=s.split("");
		int[] r = new int[s1.length];
		System.out.println(s1[2]);

		for (int i = 0; i < s1.length; i++) {
		    try {
		    	if(!s1[i].isEmpty()) {
		    		System.out.println(s1[i]);
		        r[i] = Integer.parseInt(s1[i]);
		     // System.out.println(r[i]);
		    	}
		    	} catch (NumberFormatException nfe) {
		    
		    }
		    
		}
		//System.out.println(r.length);
		for (int i = 0; i < r.length; i++) {
			//System.out.println(r[i]);
		}
		m=2;
		n=4;
		
		int a[][]=new int[m][n];
		//System.out.println(r[2]);
		for(int i = 0; i<m; i++) {
		    for(int j = 0; j<n; j++){
		        a[i][j] = r[j];
		        j++;
		      // System.out.println(a[i][j]);
		    }
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.println(a[i][j]);
				
			}
			
		}
		
		
		
	
}
		
		
		

	}


