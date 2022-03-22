package com.youli.javaBasicsDemo;

import java.awt.print.Printable;

/**
 *  多重循环02
 * @author admin
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		// 10的阶乘求和
		int sum = 0;
		// 外层
		for (int i = 1; i <= 10; i++) {
			int s = 1;
			for (int j = 1; j <= i; j++) {
				System.out.println("i=" + i + ";j=" + j);
				System.out.println("s=s*j=" + s + "*" + j + "=" + (s = s * j));
//				s *=j;	//s=s*j;
				System.out.println("s:" + s);
			}
			System.out.println(i + "的阶乘为" + s);
			sum += s;
		}
		System.out.println("10的阶乘求和:" + sum);

		//打印九九乘法表
		//外层循环控制行数
		int result = 0;
		for(int i = 1 ;i<=9;i++) {
			//内层循环控制列数
			for(int j = 1;j<=i;j++) {
				result = j * i ;
				System.out.print(j+"X"+i+"="+result+"\t");	//\t:制表符号
			}
			System.out.println();	//每个内层循环完，换行
		}
		
	}
}
