package com.youli.javaBasicsDemo;

import java.awt.print.Printable;

/**
 *  循环语句中的break、continue、return
 * @author admin
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		//一、使用break结束循环
		//1.作用：在某种条件出现时强行终止循环，用于完全结束一个循环，跳出循环体。
		for(int i = 1;i<=10;i++) {
			if(i==4) {
				break;
				//不会再执行i=5.... 直接跳出循环
			}
			System.out.println(i);
		}
		
		//2.break不仅可以结束所在的循环，还可以直接结束其外层循环，需要在break后面紧跟一个标签，这个标签用于表示一个外层循环，标签是一个后面紧跟着 ：标识符。
		//标签只有放在循环语句之前才有用！
		other:
		for(int i = 1;i<=10;i++) {
			System.out.println("i:"+i);
			for(int j = 1;j<=10;j++) {
				if(j==5) {
					break other;
					//跳出outer标签所标识的循环
				}
				System.out.println("j:"+j);
			}
		}
		
		//二、使用continue忽略本次循环剩下语句
		for(int i = 1;i<=10;i++) {
			if(i == 3) {
				continue;	//i等于3时，不会执行下方的语句，但是会继续i=4循环
			}
			System.out.println("Hello!"+i);
			
		}
		
		
	}
}
