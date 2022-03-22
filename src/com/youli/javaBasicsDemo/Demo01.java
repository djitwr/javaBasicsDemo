package com.youli.javaBasicsDemo;

/**
 * 数据类型和类型转换 注意:String不是基本数据类型,而是引用数据类型
 * 
 * @author admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
//		int a = 3;
//		double b = 3.14;
//		float c = 3.14f;
//		char d = '男';
//		String e = "今天是9.20号";
//		System.out.println("a:"+a+",b:"+b+",c:"+c+",d:"+d);
//		System.out.println("字符串e的长度："+e.length());

		// 1)自动类型转换
		// ASCLL自动转换
		int i = 'a'; // char类型自动转换为十进制
//		System.out.println(i);
		char d = 123;  //123-->{
		System.out.println("d:"+d);
		
		String str = "123"; // 字符串+int类型：拼接为字符串
		int a = 2;
//		System.out.println(str+a);
		int stri = Integer.parseInt(str); // 将字符串类型转化为int类型
//		System.out.println(stri+a); //加法运算

		// 2)强制类型转换
		long b = 150;
//		int c = (int)b; //大转小:需要强制类型转换
		byte c = (byte) b; // 如果大的超出转出类型的范围将会溢出,数据会丢失;byte范围为-128~127
		System.out.println("DD======DD"+c);

//		表达式类型的自动提升
//		当一个算数表达式包含多个基本类型的值时，整个算术表达式的数据类型将发生自动提升。
//		Java定义了如下的自动提升规则:
//		1).所有的byte类型，short类型和char类型将被提升到int类型。
//		2).整个算术表达式的数据类型自动提升到表达式中最高等级操作数同样的类型。
		short aa = 20;
		System.out.println((aa + a));
		System.out.println(getType((aa + a)));

//		转义字符：用来表示特殊的符号或特殊意义
//		\b ：表示后退一个字符
//		\t ：表示一个制表位
//		\n ：表示换到下一行
//		\r : 回车
//		\" ：表示双引号
//		\' ：表示单引号
//		\\ ：表示反斜杠字符\
		System.out.println("张三说:\"你好!\"");
	}
	// 获取变量类型的方法:
	static String getType(Object o) {
		return o.getClass().toString(); //
	}

}
