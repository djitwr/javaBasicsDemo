package com.youli.javaBasicsDemo5;

public class SglDemoTest {
	//无论获取多少次SglDemo2对象，都是同一个对象
	public static void main(String[] args) {
		SglDemo sglDemo = SglDemo.getInstence();
		SglDemo sglDemo2 = SglDemo.getInstence();
		//判断两个对象是否是一个对象，
		//“==”:比较内存地址是否一致
		System.out.println(sglDemo == sglDemo2); //ture

	}

}
