package com.sgtesting.qatest1;

public class Char2DLastRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[][] = {{'a','b','c'},{'%','&','#'},{'1','2','3'}};// creation ion of 2d char
		
		 for(int col =0 ; col <=ch[2].length-1;col++)
			System.out.print(ch[2][col]+" ");  //last row
	}

}
