package com.sgtesting.qatest1;

public class asg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3};//create intialize  1D
		int b[]= {1,2,3,};//create intialize  1D
		int c[]= new int[a.length];//create  1D with size 
		for(int i= 0;i<=a.length-1;i++)
		{
		  c[i]= a[i]+b[i];//add 1D and store in another 1D
		  
		}
		
		for(int j=0; j<=c.length-1;j++)
		System.out.print(c[j]+" ");

	}

}
