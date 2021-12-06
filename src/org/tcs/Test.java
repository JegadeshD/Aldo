package org.tcs;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int jag = s.nextInt();
		System.out.println(jag);
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		short nextShort = s.nextShort();
		System.out.println(nextShort);
		long nextLong = s.nextLong();
		System.out.println(nextLong);
		byte nextByte = s.nextByte();
		System.out.println(nextByte);
		double nextDouble = s.nextDouble();
		System.out.println(nextDouble);
		boolean nextBoolean = s.nextBoolean();
		System.out.println(nextBoolean);
		String next = s.next();
		System.out.println(next);
		s.nextLine();
		String nextLine = s.nextLine();
		System.out.println(nextLine);
	
	}

}
