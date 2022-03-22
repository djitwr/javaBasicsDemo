package com.youli.javaBasicsDemo4;
/**
 * 引用变量的类型强制转换和instanceof运算符
 * @author admin
 *
 */
public class Sub extends Base {
	
	//重写父类say()方法
	public void say() {
		System.out.println("Sub的say()方法");
	}
	
	//子类的特有方法
	public void read() {
		System.out.println("Sub的read()方法，子类的特有方法，父类中没有的方法");
	}

}
