package org.programme;

public class Basics {
	public static void main(String[] args) {
		int a=435,rem=0,rev=0;
		
		while (a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		System.out.println(rev);
	}
}
