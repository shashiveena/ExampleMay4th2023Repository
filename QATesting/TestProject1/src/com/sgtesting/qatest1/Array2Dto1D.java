package com.sgtesting.qatest1;

public class Array2Dto1D {

	public static void main(String[] args) {


		int[][] a= {{1,2,3},{4,5,6}};
		int[][] b = {{7,8,9},{10,11,12,}};
		int c[]=new int [a.length*a[0].length+b.length*b[0].length];// memory size to store ;works for matrix 
		System.out.println(c.length);
		int k=0; //variable : index to store the elements of 1D array 

		/*copy the 2D first array elements to 1D array*/
		for(int row=0;row<=a.length-1;row++) //row elemts of sirst array
		{

			for(int col =0;col<=a[row].length-1; col++) //colmn elemts of first array

			{
				c[k]=a[row][col]; //assign first 2D elements  to 1D array
				k++;

			}

		}

		/*copy/Right pad  the 2D second array elements to 1D array :to the  right side by default*/
		for(int row=0;row<=b.length-1;row++)  //row element of second array
		{

			for(int col =0;col<=b[row].length-1; col++) //column elements second array

			{
				c[k]=b[row][col];//assign second 2d elements to 1D array in continuation to first
				k++;

			}

		}


		/*print the 1D Araraay*/

		for(int row=0;row<=c.length-1;row++)
			System.out.print(c[row]+" ");

	}

}
