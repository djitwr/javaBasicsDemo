package com.youli.javaBasicsDemo;

import java.util.Arrays;


/**
 * ����
 * 
 * @author admin
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		int arr[] = { 10, 2, 8, 9, 13, 16, 7 };
//		System.out.println(arr[0]);
		// forѭ����������
		for (int i = 0; i < arr.length; i++) {
			System.out.println("forѭ����������arr:" + arr[i]);
		}

		// foreachѭ����������
		for (int i : arr) {
			System.out.println("foreachѭ����������arr:" + i);
		}

		// Arrays������������Ԫ�صĴ�ӡ
		System.out.println("Arrays������������Ԫ�صĴ�ӡ" + Arrays.toString(arr)); // [10, 2, 8, 9, 13, 16, 7]

		// ��ӡ��ĸ������
		char[] arr1 = { 'A', 'B', 'C', 'D' };
		// �����εĲ���
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print(arr1[i]);
			}
			System.out.println();
		}

		// ��ά����
		int[][] arr2 = { { 1, 2, 6 }, { 9, 8, 1 }, { 2, 3 }, { 3 }, { 29, 13, 12 } };
		for (int i = 0; i < arr2.length; i++) { // ��������Ԫ����һ��һ������
			for (int j = 0; j < arr2[i].length; j++) { // ������Ӧλ���ϵ�һά����
//				System.out.print("��ά���������" + arr2[i][j] + "\t,");
			}
		}
		//Arrays.deepToString()��ֱ�ӱ��ά����
		System.out.println(Arrays.deepToString(arr2));

	}

}
