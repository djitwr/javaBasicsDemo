package com.youli.javaBasicsDemo2;
/**
 * 变量的作用域和变量初始化顺序
 * @author admin
 *
 */
public class Demo03 {
	private static int a;
	public static void main(String[] args) {
		modify(a);
		System.out.println(a);
	}

	public static void modify(int a) {
		a++;
	}

}
