package com.sgtesting.qatest1;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40};
		int sum=0;
		//int avg=0;

		System.out.println("no of elememts "+a.length);//find the no of elements 
		System.out.println();
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];

		}

		System.out.println("sum " +sum);
		System.out.println("avg=  "+ sum/a.length);
	}
}
