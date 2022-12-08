package com.xworkz.Stringapp;

import java.util.Scanner;

public class ReverseName {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentance=sc.nextLine();
		String word=sc.next();
		String reverse="";
		String[] str=sentance.split(" ");
		
		for(int  i=0; i<str.length;i++) {
			if(str[i].equals(word)) {
				char ch[]=word.toCharArray();
				for(int  j=word.length()-1; j>=0; j--) {
					reverse= reverse+ch[j];
				}
				str[i]=reverse;
			}
		}
		for( int i=0; i<str.length; i++) {
		System.out.print(str[i]+" ");	
		}
		//System.out.println(reverse);
		
	}

}
