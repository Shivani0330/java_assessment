package com.assessment.java;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		
		for(int outerIndex=1;outerIndex<=number;outerIndex++) {
			for(int innerIndex=1;innerIndex<=number;innerIndex++) {
				if(outerIndex==1 || outerIndex==number || innerIndex==1 || innerIndex==number ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
