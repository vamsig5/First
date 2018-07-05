package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spiral {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter the number of elements : ");
	        int n=Integer.parseInt(br.readLine());
	        System.out.print("Enter the find elements : ");
	        int m=Integer.parseInt(br.readLine());
	        

	        int A[][]=new int[n][n];
	        int k=n*n, c1=n-1, c2=0, r1=n-1, r2=0;

	        while(k>=1)
	            {
	                for(int i=c1;i>=c2;i--)
	                {
	                    A[r1][i]=k--;
	                   // System.out.println(A[r1][i]);
	                }
	                

	                for(int j=r1-1;j>=r2;j--)
	                {
	                    A[j][c2]=k--;
	                   // System.out.println(A[j][c2]);
	                }

	               for(int i=c2+1;i<=c1;i++)
	                {
	                    A[r2][i]=k--;
	                    //System.out.println(A[r2][i]);
	                    
	                }
	                for(int j=r2+1;j<=r1-1;j++)
	                {
	                    A[j][c1]=k--;
	                   // System.out.println(A[j][c1]);  
	                    
	                }

	             c1--;
	             c2++;
	             r1--;
	             r2++;
	            }

	        /* Printing the Circular matrix */
	        System.out.println("The Circular Matrix is:");
	        for(int i=0;i<n;i++)
	            {
	                for(int j=0;j<n;j++)
	                    {
	                        System.out.print(A[i][j]+ "\t");
	                    }
	             System.out.println();
	            }
	        int x=0,y=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	                {
	                    if(A[i][j]==m) {
	                    x=i;
	                    y=j;
	                    }
	                }
	      
	        }
	       // System.out.println(x+" "+y);
	        int a=0,b=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	                {
	                    if(A[i][j]==1) {
	                    a=i;
	                    b=j;
	                    }
	                }
	      
	        }
	        //System.out.println(a+" "+b);
	        System.out.println((a-x)+" "+(b-y));
	}

}
