package com.gl.dsa.lab2;

import java.util.Scanner;

public class Denominations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noteCounter[] = new int[9];
		int amount=0;
		int size=0;
		int notes[];
		
		System.out.println("Enter the size of currency denominations");
		size=sc.nextInt();
		notes=new int[size];
		
		System.out.println("Enter the currency denomination values");
		for(int i=0;i<size;i++)
			notes[i]=sc.nextInt();
		
		//Arranging currency in descending order
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(notes[j]<notes[j+1]) {
					int temp=notes[j];
					notes[j]=notes[j+1];
					notes[j+1]=temp;
				}
			}
		}
		
		//for(int i=0;i<size;i++)
		//System.out.println(notes[i]);
		
		System.out.println("Enter the amount you want to pay");
		amount=sc.nextInt();
		
		System.out.println("Your payment approach in order to give minimum number of notes will be");
		for(int i=0;i<size;i++) {
			if(amount>=notes[i]) {
				noteCounter[i] = amount/notes[i];
				amount=amount-noteCounter[i]*notes[i];
			}
		}
		
		for(int i=0;i<9;i++) {
			if(noteCounter[i]!=0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
		
	sc.close();	
	}

}
