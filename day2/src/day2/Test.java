package day2;




public class Test {

	   
	

	public static void main(String[] args) {
		
		String s="5 3 7 17/n"+"12 11 6 15/n"+"3 2 8 9/n"+"1 14 19 24";
		s=s.replaceAll("/n", " ").replaceAll("/r", " ");
		String[] s1=s.split(" ");
		//System.out.println(s1.length);

		int[] r = new int[s1.length];

		for (int i = 0; i < s1.length; i++) {
		    try {
		        r[i] = Integer.parseInt(s1[i]);
		            } catch (NumberFormatException nfe) {
		        
		    }
		}
		for (int i = 0; i < r.length; i++) {
			//System.out.println(r[i]);
		}
		int n=r.length/4;
		//System.out.println(n);
		
		int[][] A=new int[n][n];
		
		
			
		
		for (int i=0,j = 0; j< A.length; j++) {
			for (int k = 0; k < A.length; k++) {
				if(i<r.length) {
				      A[j][k]=r[i];
				        i++;
				       }
			  }
			}
		/*for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]);
				System.out.print(" ");
			}
			System.out.println();
			
		}*/
		
		int largest[]=new int[A.length];
		int smallest[]=new int[A.length];
		int max=0;
		int min=0;
		for (int i = 0; i < A.length; i++) {
			max=A[i][0];
			for (int j = 0; j < A.length; j++) {
				
				if(max<A[i][j]) {
					max=A[i][j];
					}
			        largest[i]=max;
		/*		
			min=A[i][0];
			if(A[i][j]<min) {
				min=A[i][j];
				System.out.println(min);
				}
		smallest[j]=min;*/
			
		}
		
			
		}
		for (int i = 0; i < A.length; i++) {
			min=A[i][0];
			for (int j = 0; j < A.length; j++) {
				
				
			
			//System.out.println(min);
			//System.out.println(A[i][j]);
			if(min>A[i][j]) {
				min=A[i][j];
				//System.out.println(min);
				//System.out.println();
				}
			smallest[i]=min;
			}
			//System.out.println("********************************");
		
			
		
		
			
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
		
	}


