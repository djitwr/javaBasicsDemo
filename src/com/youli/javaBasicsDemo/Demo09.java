package com.youli.javaBasicsDemo;

/**
 * 方法的重载
 * @author admin
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		int i = myAdd(1,2);
		System.out.println(i);
	}
	
	public static int myAdd(int a,int b) {
		return a+b;
	}
	
	public static int myAdd(int a) {
		return a;
	}

}
