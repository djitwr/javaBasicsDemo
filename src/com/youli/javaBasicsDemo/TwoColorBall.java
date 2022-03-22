package com.youli.javaBasicsDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoColorBall {
	public static void main(String[] args) {
		int[] sysRedBall = new int[6];
		int sysBlueBall = 0;
		int[] userRedBall = new int[6];
		int userBlueBall = 0;

		int redCount = 0; // 红球正确的个数
		int blueCount = 0;

		Random r = new Random();
		int[] redBall = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33 };

		// 生成系统号码
		int index = 0;
		for (int i = 0; i < sysRedBall.length; i++) {
			while (true) {
				index = r.nextInt(33);
				if (redBall[index] != -1) {
					sysRedBall[i] = redBall[index];
					redBall[index] = -1;
					break;
				}
			}
		}
		sysBlueBall = r.nextInt(16) + 1;

		// 接受用户选号
		System.out.println("请选择红球号码，从1-33中选择（一共6个号码）：");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < userRedBall.length; i++) {
			userRedBall[i] = in.nextInt();
		}
		System.out.println("请选择蓝球号码，从1-13中选择（一共1个号码）：");
		userBlueBall = in.nextInt();

		// 验证是否中奖
		for (int i = 0; i < sysRedBall.length; i++) {
			for (int j = 0; j < userRedBall.length; j++) {
				if (sysRedBall[i] == userRedBall[j]) {
					redCount++;
					break;
				}
			}
		}

		if (sysBlueBall == userBlueBall) {
			blueCount++;
		}

		// 判断是否中奖
		if (redCount == 6 && blueCount == 1) {
			System.out.println("恭喜您，中了一等奖！");
		} else if (redCount == 6 && blueCount == 0) {
			System.out.println("恭喜您，中了二等奖！");
		} else if (redCount == 5 && blueCount == 1) {
			System.out.println("恭喜您，中了三等奖！");
		} else if (redCount == 5 && blueCount == 0) {
			System.out.println("恭喜您，中了四等奖！");
		} else if (redCount == 4 && blueCount == 1) {
			System.out.println("恭喜您，中了四等奖！");
		} else if (redCount == 4 && blueCount == 0) {
			System.out.println("恭喜您，中了五等奖！");
		} else if (redCount == 3 && blueCount == 1) {
			System.out.println("恭喜您，中了五等奖！");
		} else if (redCount == 2 && blueCount == 1) {
			System.out.println("恭喜您，中了六等奖！");
		} else if (redCount == 1 && blueCount == 1) {
			System.out.println("恭喜您，中了六等奖！");
		} else if (redCount == 0 && blueCount == 1) {
			System.out.println("恭喜您，中了六等奖！");
		} else {
			System.out.println("对不起，您没有中奖！");
		}

		System.out.println("本期中奖红球号码：" + Arrays.toString(sysRedBall) + ";蓝球号码：" + sysBlueBall);
		System.out.println();
		System.out.println("您的红球号码为：" + Arrays.toString(userRedBall) + "；蓝球号码为：" + userBlueBall);

	}

}
