package com.youli.javaBasicsDemo;

public class Demo03 {
	public static void main(String[] args) {
//		double score = 59.5;
//		String mark = (score >= 60) ? "及格" : "不及格";
//		System.out.println(mark + ":" + score);
//
//		if (score >= 80) {
//			System.out.println("成绩优秀:" + score);
//		} else if (score >= 60) {
//			System.out.println("成绩及格:" + score);
//		} else {
//			System.out.println("不及格:" + score);
//		}

		/**
		 * case语句中少写了break，编译不会报错 但是会一直执行之后所有case条件下的语句，并不再进行判断，直到default语句
		 */
		char sex = '女';
		switch (sex) {
		case '男':
			System.out.println("男生");
//			break;
		case '女':
			System.out.println("女生");
//			break;
		default:
			System.out.println("性别未知！");
//			break;
		}

	}
}
