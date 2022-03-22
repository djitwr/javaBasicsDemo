package com.youli.javaBasicsDemo5;

public class SglDemo2Test {
	public static void main(String[] args) {
		//无论获取多少次SglDemo2对象，都是同一个对象
		SglDemo2 sglDemo2 = SglDemo2.getInstence();
		SglDemo2 sglDemo22 = SglDemo2.getInstence();
		//判断两个对象是否是一个对象，
		//“==”:比较内存地址是否一致
		System.out.println(sglDemo2 == sglDemo22); //ture
	}
}
