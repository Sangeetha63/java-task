package com.xworkz.Stringapp;

public class MergeArray {
	public static void main(String args[]) {
		int[]a= {1,2,3,4};
		int[]b= {5,6,7,8,9};
		int[]c=new int[a.length+b.length];
		for( int i=0; i<b.length; i++) {
			c[i]=b[i];
		}
			for( int j=0; j<a.length; j++) {
				c[j+b.length]=a[j];
			
		}
			for( int i=0; i<c.length; i++) {
				System.out.print(c[i]+" ");
			
	}
		

	}
}
