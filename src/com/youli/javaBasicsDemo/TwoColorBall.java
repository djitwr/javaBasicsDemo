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

		int redCount = 0; // ������ȷ�ĸ���
		int blueCount = 0;

		Random r = new Random();
		int[] redBall = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33 };

		// ����ϵͳ����
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

		// �����û�ѡ��
		System.out.println("��ѡ�������룬��1-33��ѡ��һ��6�����룩��");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < userRedBall.length; i++) {
			userRedBall[i] = in.nextInt();
		}
		System.out.println("��ѡ��������룬��1-13��ѡ��һ��1�����룩��");
		userBlueBall = in.nextInt();

		// ��֤�Ƿ��н�
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

		// �ж��Ƿ��н�
		if (redCount == 6 && blueCount == 1) {
			System.out.println("��ϲ��������һ�Ƚ���");
		} else if (redCount == 6 && blueCount == 0) {
			System.out.println("��ϲ�������˶��Ƚ���");
		} else if (redCount == 5 && blueCount == 1) {
			System.out.println("��ϲ�����������Ƚ���");
		} else if (redCount == 5 && blueCount == 0) {
			System.out.println("��ϲ���������ĵȽ���");
		} else if (redCount == 4 && blueCount == 1) {
			System.out.println("��ϲ���������ĵȽ���");
		} else if (redCount == 4 && blueCount == 0) {
			System.out.println("��ϲ����������Ƚ���");
		} else if (redCount == 3 && blueCount == 1) {
			System.out.println("��ϲ����������Ƚ���");
		} else if (redCount == 2 && blueCount == 1) {
			System.out.println("��ϲ�����������Ƚ���");
		} else if (redCount == 1 && blueCount == 1) {
			System.out.println("��ϲ�����������Ƚ���");
		} else if (redCount == 0 && blueCount == 1) {
			System.out.println("��ϲ�����������Ƚ���");
		} else {
			System.out.println("�Բ�����û���н���");
		}

		System.out.println("�����н�������룺" + Arrays.toString(sysRedBall) + ";������룺" + sysBlueBall);
		System.out.println();
		System.out.println("���ĺ������Ϊ��" + Arrays.toString(userRedBall) + "���������Ϊ��" + userBlueBall);

	}

}
