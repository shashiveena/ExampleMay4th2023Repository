package com.sgtesting.qatest1;

public class ArrayCopyRead1DDemo2 {

	public static void main(String args[])
	{
		int a[]= {5,10,15,20,25}; //create array
		int b[]= new int[a.length];

		for(int i= 0;i<=a.length-1;i++)
		{   
			b[i]=a[i];  //copy the elements
			
		}
		System.out.println();
		System.out.println("print the copy of array elements in rev order  ");
		System.out.println();
		for(int j=(b.length)-1;j>=0;j--)
		{
			System.out.print(b[j]+ " "); //reverse order 

		}



	}
}



