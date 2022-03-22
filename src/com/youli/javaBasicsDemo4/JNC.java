package com.youli.javaBasicsDemo4;
/**
 * 多态
 * @author admin
 *
 */
public class JNC extends Wine {
	
//	public void fun1() {
//		System.out.println("Wine的fun1方法...");
//		fun2();
//	}
//	
//	public void fun2() {
//		System.out.println("Wine的fun2方法...");
//	}
	
	public void fun1(String a) { //方法的重载：子类和父类方法名相同，参数列表不同
		System.out.println("JNC的fun1方法...");
	}
	
	public void fun2() { //方法的重写：子类和父类方法名和参数列表都相同
		System.out.println("JNC的fun2方法...");
	}
	
}
