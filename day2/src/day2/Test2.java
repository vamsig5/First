package day2;

public class Test2 {

	public static void main(String[] args) {
		String s="116	1259	  1045	679	1334	 157 	277	1217	 218	 641	 1089	136	247	1195 	239	834\n" + 
				"269	1751	732	3016	260	6440	5773	4677	306	230	6928	7182	 231	2942	 2738	 3617";
		
		s=s.replaceAll("/n", " ").replaceAll("/r", " ");
		String[] s1=s.split(" ");
		System.out.println(s1.length);

		int[] r = new int[s1.length];

		for (int i = 0; i < s1.length; i++) {
		    try {
		        r[i] = Integer.parseInt(s1[i]);
		            } catch (NumberFormatException nfe) {
		        
		    }
		}
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
		
		/*
		//System.out.println(n);
		
		
		int[][] A=new int[row][col];
		
		
			
		
		for (int i=0,j = 0; j< row; j++) {
			for (int k = 0; k < col; k++) {
				if(i<r.length) {
				      A[j][k]=r[i];
				        i++;
				       }
			  }
			}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j]);
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
		int largest[]=new int[row];
		int smallest[]=new int[row];
		int max=0;
		int min=0;
		for (int i = 0; i < row; i++) {
			max=A[i][0];
			min=A[i][0];
			for (int j = 0; j < col; j++) {
				
				if(max<A[i][j]) {
					max=A[i][j];
					}
			        largest[i]=max;
			
			
			if(min>A[i][j]) {
				min=A[i][j];
				//System.out.println(min);
				}
		smallest[i]=min;
			
		}
		
			
		}
	
		
		
		for (int i = 0; i < largest.length; i++) {
			System.out.println(largest[i]);
			
		}
		System.out.println("********************************");
		
		for (int i = 0; i < smallest.length; i++) {
			
			System.out.println(smallest[i]);
			
		}
		System.out.println("********************************");

		int[] psum=new int[4];
		int sum=0;
		for (int i = 0; i < A.length; i++) {
			psum[i]=0;
			psum[i]=psum[i]+(largest[i]-smallest[i]);
			System.out.println(psum[i]);
			sum=sum+psum[i];
			
		}
		System.out.println("********************************");
		System.out.println(sum);
		
		
		
		}
	public static int rowcount(String s) {
		int r=0;
		String[] s1=s.split("/n");
		r=s1.length;
		return r;
	}*/
		
	
	}	
		
}
