package com.youli.javaBasicsDemo;

import java.util.Arrays;

/**
 * java�����㷨 ð������
 * 
 * @author admin
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		bubbleSort();
		bubbleSort2();
	}

	public static void bubbleSort() {
		int compareCounter = 0;
		int arr[] = { 11, 9, 96, 1, 29, 3, 2, 17, 19, 23, 10 };
		int temp = 0;
		int compareRange = arr.length - 1; // �Ƚ����ֵı߽�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= compareRange; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1]; // �����ȷ���temp��
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			compareCounter++;
		}
		System.out.println("ԭ����ð�����������飺" + Arrays.toString(arr));
		System.out.println("ԭ�������������" + compareCounter);
	}

	// �����һ�������У�����Ԫ��û�з���������˵�������Ѿ���������ѭ�����ɡ��Ż���Ĵ������£�
	public static void bubbleSort2() {
		int compareCounter = 0;
		int arr[] = { 11, 9, 96, 1, 29, 3, 2, 17, 19, 23, 10 };
		int temp = 0;
		int compareRange = arr.length - 1; // �Ƚ����ֵı߽�
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = 1; j <= compareRange; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1]; // �����ȷ���temp
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			compareCounter++;
		}
		System.out.println("�Ż����ð�����������飺" + Arrays.toString(arr));
		System.out.println("�Ż�������������" + compareCounter);

	}

}
