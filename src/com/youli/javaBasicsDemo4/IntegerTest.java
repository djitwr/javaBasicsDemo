package com.youli.javaBasicsDemo4;

/**
 * 包装类和JDK1.5后自动拆装箱
 * 
 * @author admin
 *
 */
public class IntegerTest {
	public static void main(String[] args) {
		//int和integer类之间的转换 
		int n = 10;
		Integer n1 = new Integer(n);
		System.out.println("int类型转换为integer类型：" + n1);
		
		Integer i = new Integer(50);
		int i1 = i.intValue();
		System.out.println("integer类型转换为int类型：" + i);
		
		//JDK1.5后自动拆装箱：不需要上面麻烦方法，可以使用和赋值一样的方法，直接转换，但是原理和上面原理一样
		//自动装箱：将 基本数据类型 封装为对象类型，来符合java的面向对象的思想。 
		//自动拆箱：将对象重新转化为基本数据类型
		int ii = 122;
		Integer iii = 222;
		ii = iii;
		
		//字符串和(int)integer类之间的转换
		String str = "123";
		Integer stri = Integer.parseInt(str);
		System.out.println("字符串和(int)integer类之间的转换stri：" + stri);
		
		Integer i2 = new Integer(111);
		String string = stri.toString(i2);
		System.out.print("字符串和(int)integer类之间的转换string：" + string);
		
	}

}
