package com.youli.javaBasicsDemo6;

public class TestMain {
	public static void main(String[] args) {
		Day[] days = Day.values(); //values()方法的作用就是获取枚举类中的所有变量，并作为数组返回，枚举类型常量就是一个个对象
		for (Day day : days) { //循环遍历数组
			System.out.println(day);
		}
		
		Day monday = Day.valueOf("MONDAY"); //valueOf方法返回的值：是monday对象
		System.out.println(monday); //强调：控制台输出的内容是字符串：“MONDAY”，是一个文字描述

	}

}
