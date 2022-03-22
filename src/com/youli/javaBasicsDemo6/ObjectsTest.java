package com.youli.javaBasicsDemo6;

import java.util.Objects;

public class ObjectsTest {
	public static void main(String[] args) {
		Integer[] i1 = new Integer[] {1,2,3};
		Integer[] i2 = new Integer[] {1,2,3};
		System.out.println(Objects.deepEquals(i1, i2));
		
		String string = null;
		System.out.println(Objects.hashCode(string));
	}

}
