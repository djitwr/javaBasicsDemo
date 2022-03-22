package com.youli.javaBasicsDemo;

/**
 * 算数赋值,比较运算符,逻辑运算符
 * 
 * @author admin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int a = 5;
		int b = ++a; // ++或者--在数值左边:让a先自增再赋值给变量b
		System.out.println("a:" + a); // a先自增:5+1=6
		System.out.println("b:" + b); // 6

		int c = 5;
		int d = c++; // ++或者--在数值右边:先将c的值赋给变量d,再进行自增操作
		System.out.println("c:" + c); // c自增:5+1=6
		System.out.println("d:" + d); // 先将c=5的值赋给变量d,则d为5
		// 注意:自增和自减运算符只能用于操作变量,不能直接用于操作数值或常量!例如 5++ 、 8-- 等写法都是错误的.

		System.out.println("---------------比较运算符-------------------");
		// 比较运算符: (注意:String不是基本数据类型,而是引用数据类型)
		// "=="和"equals"的区别:"=="比较的是两个对象的内存地址是否一致;"equals()"比较的两个对象的内容是否一致
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc"); // new一个新的字符串
		System.out.println(s1 == s2); // 两个对象地址是一样的,则为true
		System.out.println(s1 == s3); // 两个对象地址不一样的,则为false
		System.out.println(s1.equals(s3)); // 比较内容是否一致,true

		System.out.println("----------------逻辑运算符----------------------");
		// 与运算: & &&
		System.out.println(true && false); // 同时满足为则为true
		// 或运算: | ||
		System.out.println(true || false); // 其中一个满足则为true
		// 非运算: !
		System.out.println(!false); // 取反
		// 异或运算: ^ 一真一假才为true
		System.out.println("异或运算:" + (true ^ false)); // true
		System.out.println("异或运算:" + (true ^ true)); // false

		System.out.println("----------------位运算----------------------");
		int i = 12;
		i = i << 1; // 左移1位
		System.out.println("左移1位后的i:"+i);	//24

		System.out.println("----------------三目运算----------------------");
		double score = 55.5;
		String mark = (score>=60)?"及格":"不及格";
		System.out.println(mark+":"+score);

	}

}
