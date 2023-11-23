package com.excep;

public class Finnaly {

	/**
	 * We need to write system.exit(0) to stop the finally runinng jvm shutdown in
	 * try
	 * 
	 * @return
	 */

	public static int m1() {

		int[] x = { 1, 2, 3, 4 };

		try {
			System.out.println(x[5]);
//			System.exit(0);
			return 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0 ;
		} 
//			finally {
//			System.out.println("Hello");
//		}
	}
	public static void main(String[] args) {
		Finnaly fn = new Finnaly();
		fn.m1();
		
		System.out.println("hi");
	}
}
