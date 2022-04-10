package com.gl.dsa.lab2;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int list[];
		int size=0;
		int total=0;
		int target=0;
		int sum=0;
		
		System.out.println("Enter the size of transaction Array");
		size=sc.nextInt();
		list=new int[size];
		
		System.out.println("Enter the value of transaction array");
		for(int i=0;i<size;i++)
			list[i]=sc.nextInt();
		
		System.out.println("Enter the to total number of targets that needs to be achieved");
		total=sc.nextInt();
		for(int i=0;i<total;i++) {
		System.out.println("Enter the value of target");
		target=sc.nextInt();
		for(int j=0;j<size;j++) {
			sum=sum+list[j];
			if(sum>=target) {
				System.out.println("Target achieved after "+(j+1)+" transaction\n");
				break;
			}
		}
		if(sum<target) {
			System.out.println("Target is not achieved\n");

		}
	}
		sc.close();
}
}
