package com.youli.javaBasicsDemo6;

public class Demo {
	public static void main(String[] args) {
		Class class1 = new Demo().getClass(); //getClass方法：获取类名
		//所有类都是Object的子类，就继承了Object的方法，
		//即demo对象可以调用getClass方法
		System.out.println(class1);
		Demo demo = new Demo();
		System.out.println(demo.hashCode()); // public native int hashCode()方法
		//hashCode返回的值：一般是通过将该对象的内存地址转换成一个整数来实现。
		//该方法不是java实现的，因此使用了native关键字。
	}

}
