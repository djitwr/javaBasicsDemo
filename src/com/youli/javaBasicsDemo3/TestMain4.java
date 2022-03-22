package com.youli.javaBasicsDemo3;
/**
 * static关键字,能通过this访问静态成员变量吗？:静态成员变量虽然独立于对象，但是不代表不可以通过对象去访问，
 * 所有的静态方法和静态变量都可以通过对象访问（只要访问权限足够）。
 * @author admin
 *
 */
public class TestMain4 {
	static int value = 33;
	public static void main(String[] args) {
		new TestMain4().printValue();
	}
	
	private void printValue() {
		int value = 3;
		System.out.println(this.value);
	}

}
