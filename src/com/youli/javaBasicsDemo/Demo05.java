package com.youli.javaBasicsDemo;

/**
 * ����ѭ��01
 * 
 * @author admin
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		// ��ӡֱ��������:
		// �������ѭ��������
		for (int i = 0; i < 5; i++) {
			// ÿ�пո�ĸ���
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// ����ÿ��*�ĸ���
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ��ӡ����������:
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
