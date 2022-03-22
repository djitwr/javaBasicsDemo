package com.youli.javaBasicsDemo5;
/**
 * 单列模式:单例模式指的是在应用整个生命周期内只能存在一个实例
 * 能够避免实例对象的重复创建，减少创建实例的系统开销，节省内存。
 * 
 * 饿汉模式
 * @author admin
 *
 */
public class SglDemo {
	
	//2.新建属性
	private static SglDemo sglDemo = new SglDemo();//饿汉模式，新建属性时，就初始化对象
	
	//1.将构造器私有化：其他类将不能new该类的对象实例
	private SglDemo() {
		
	}
	
	//3.提供一个外部获取本类对象的公共方法
	public static SglDemo getInstence() {
		return sglDemo;
	}

}
