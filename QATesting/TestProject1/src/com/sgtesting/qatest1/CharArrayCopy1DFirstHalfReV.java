package com.sgtesting.qatest1;

public class CharArrayCopy1DFirstHalfReV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = {'a','b','c','%','&','#'}; //creata and intialise

		char ch1[]= new char[ch.length/2];
		System.out.println("ch.length is= " +ch.length);//length
		for(int i=0;i<=(ch.length/2)-1;i++)
		{			
			ch1[i]=ch[i];	//copy to array 2		
		}
		
		System.out.print("length of cha1   is   "+ ch1.length);System.out.println();
		System.out.println("fist half in rev order  :");
		System.out.println();
		for(int j=ch1.length-1;j>=0; j--) 
		{
			System.out.print(ch1[j]+" ");//rev order of fist half
		}
	}


}
