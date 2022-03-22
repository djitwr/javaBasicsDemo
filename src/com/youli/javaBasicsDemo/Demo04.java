package com.youli.javaBasicsDemo;

/**
 * 循环语句
 * 
 * @author admin
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		// while循环：
//		语法：
//		while(循环条件){
//			　　循环操作
//			}
//		int i = 1;
//		while(i<=100) {
////			System.out.println(i+"好好学习，天天向上！");
//			i++;	//如果循环条件一直满足，就会进入死循环，必须避免！	
//		}

		// do while循环：
		// 语法：
		// do{
//		　　循环操作
//		  }while(循环条件);
		// 不管条件满不满足，都会先执行一次do循环语句
//		int a = 1;
//		while(a>100) {
//			System.out.println("while循环体被执行了");
//		}
//		do {
//			System.out.println("do.....while循环体被执行了");
//		}while(a>100);
//		
		// for循环：
		// 计算1+2+3...+100的值
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		for (int i = 1; i <= 50; i++) {
			sum2 += 101;
		}
		System.out.println("常规方法的计算结果：" + sum1);
		System.out.println("高斯方法的计算结果：" + sum2);
		
		//for循环灵活用法
		//substring(1):每次循环截掉一个字符
		String infor = "Thinking in java";
		for(String s = infor.substring(0);s.length()>0;s=s.substring(1)) {
//			System.out.println(s);
		}
	
	}

}
