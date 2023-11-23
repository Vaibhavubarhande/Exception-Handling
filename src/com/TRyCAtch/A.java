package com.TRyCAtch;

public class A {

	public void m1() {

		int[] x = { 1, 2, 3, 4 };

		try {
			System.out.println(x[4]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is Finished");
		}

		System.out.println("Continue m1");
	}
}
