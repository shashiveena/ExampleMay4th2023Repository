package com.sgtesting.qatest1;

public class DoubleArray1D {

	public static void main(String[] args) {
		
		
		double d[]= {1,1.5,2,2.5,3.5,4.5,6.5,8}; // create and initialize
		System.out.println("the initial double array is :");
		for(int i=0;i<=d.length-1;i++)
			{
			System.out.print(d[i]+" ");      //print the initial array
			}
		System.out.println();
		System.out.println("the 2nd half ofthe  double array is :");
		for(int  i=(d.length/2);i<=d.length-1; i++)
			System.out.print(d[i]+" ");
		System.out.println();
	}

}
