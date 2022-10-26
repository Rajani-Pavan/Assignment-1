/*
 * Program to print given number pattern ==> 
 * expected output 
 * 1111
 * 2222
 * 3333
 * 4444
 * 
 */
package org.assignment.ineuron.ai;

public class NumberPattern {

	public static void main(String[] args) {

		int n = 4;
		int i, j;
		int num = 1;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(num);
			}
			System.out.println();
			if (num < n) {
				num = num + 1;
			}
		}
	}

}
