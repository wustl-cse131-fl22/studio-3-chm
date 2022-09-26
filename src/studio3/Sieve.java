package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("All the prime number up to : ");
		int n= in.nextInt();
		boolean[] list1 = new boolean[n];
		int sqrtN = (int)Math.sqrt(n)+1;
		
		for (int i = 2; i < sqrtN; i++) {
			if (list1[i] == false) {
				for (int j = i * i; j < list1.length; j += i) {
					list1[j] = true;
				}
			}
		}
		
		for (int i = 2; i < list1.length; i++) {
			if (list1[i] == false) {
				System.out.println(i);
			}
		}
	}
}


