/*
 * 1. Program to print INEURON
 */

package org.assignment.ineuron.ai;

public class Ineuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int i, j;
	// Prints I
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			// prints N
			System.out.print(" ");
			for (j = 0; j <= n; j++) {
				if (i == j || j == 0 || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// prints E
			System.out.print(" ");
			for (j = 0; j < n; j++) {
				if ((i == 0 || j==0 || i == (n - 1)/2 || i == n-1) || (i == n-1 / 2 && j <= n / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			//Prints U
		    System.out.print(" ");
			for (j=0;j<n;j++) {
				 if (((i==n-1) && j>=0 && j<n-1)) {
					System.out.print("*");
				} else if (j==n-1 && i!=0 && i!=n-1) {
					System.out.print("*");
				} else if (j==0 && j<n-1 && i!=n-1 && i!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
	        //prints R
			System.out.print(" ");
			for(j=0;j<(2*n)-1;j++) {
				if((i == 0 ||j==0 || i == n/2) && j<((2*n)-1)-2) {
					System.out.print("*");
				} else if(j==((((2*n)-1)-2)) && !(i==0 || (i==n/2))) {	
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			//Prints O
			 System.out.print(" ");
			for (j=0;j<n;j++) {
				if (i==n/4 && j>n/4 && j <(3*n)/4
					|| (j==n/4 && i >n/4 && i< (3*n)/4)
					|| (i==(3*n)/4 && j >n/4 && j<(3*n)/4)
					|| (j==(3*n)/4 && i > n/4 && i <(3*n)/4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			//Prints N
			for (j = 0; j <= n; j++) {
				if (i == j || j == 0 || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
			}
	}
}
