package com.assessment.java;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();//number=5
		int space=number-1;
		int star=1;
		
		for(int outerIndex=1;outerIndex<=5;outerIndex++) {
			
			for(int index1=1;index1<=space;index1++) {
				System.out.print(" ");
			}
			for(int index2=1;index2<=star;index2++) {
				System.out.print("* ");
			}
			space--;
			star++;
			
			System.out.println();
		}
		for(int outerIndex=1;outerIndex<number+1;outerIndex++) {
			space++;
			star--;
			for(int index1=1;index1<=space;index1++) {
				System.out.print(" ");
			}
			for(int index2=1;index2<=star;index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
