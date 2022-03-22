package com.youli.javaBasicsDemo;

/**
 * 多重循环01
 * 
 * @author admin
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		// 打印直角三角形:
		// 控制外层循环，层数
		for (int i = 0; i < 5; i++) {
			// 每行空格的个数
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// 控制每行*的个数
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 打印等腰三角形:
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
