package com.daytwelve.throwdemo;

import java.util.Scanner;

public class UsingThrow {

	static void acceptNumber() throws NegativeException, GreaterValueException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 //inbuilt exception
		 * try { if (n < 0) throw new
		 * ArithmeticException("Percentage should not be negative"); else if (n > 100)
		 * throw new ArithmeticException("Percentage should not be greater than 100");
		 * else System.out.println("Valid Percentage"); } catch (ArithmeticException ae)
		 * { System.err.println("error..." + ae.getMessage());
		 * 
		 * }
		 */
		
		
		//user defined exception
		try {
			if (n < 0)
				throw new NegativeException();
			else if (n > 100)
				throw new GreaterValueException("Percentage should not be greater than 100");
			else
				System.out.println("Valid Percentage");
			System.exit(0);
		} catch (NegativeException |GreaterValueException ae) {
			System.err.println("error..." + ae.getMessage());
		}
		
	}


	public static void main(String[] args) throws NegativeException, GreaterValueException {

		System.out.println("Enter your percentage..");
		acceptNumber();

	}

}
