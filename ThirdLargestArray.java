package com.xworkz.Stringapp;


//without in built
public class ThirdLargestArray{
	 
	public static void main(String args[]){ 
		int temp;
	int  array[]= {59,20,12,9,6};
	for( int i=0; i<=array.length; i++){
	for( int j=i+1; j<=array.length; j++)
	{
		if(array[i]>array[j]) {
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	
	}
		System.out.println("enter the third larestnumber"+array[i]);
	
	}
	}
	}
}
	
