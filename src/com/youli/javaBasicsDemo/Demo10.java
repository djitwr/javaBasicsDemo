package com.youli.javaBasicsDemo;

/**
 * java�����㷨 �Ƚ���������е����ֵ
 * 
 * @author admin
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int[] arr = { 29, 2, 49, 13, 15, 33, 59, 19, 99 };
		int max = arr[0]; // �ٶ����ֵΪ�����һ��Ԫ��
		int min = arr[0]; // �ٶ���СֵΪ�����һ��Ԫ��
		int count = 0;
		int count1 = 0;
		// һ��һ���Ƚ�
		for (int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
			count++;
		}
		for (int i = 0; i < arr.length; i++) {
			min = min < arr[i] ? min : arr[i];
			count++;
		}
		System.out.println("����arr���ֵ��" + max);
		System.out.println("����arr��Сֵ��" + min);
		System.out.println("ѭ������count��" + count);

		// �����Աȣ�����ѭ������
		int[] arr1 = { 29, 2, 49, 13, 15, 33, 59, 19, 99 };
		int max1 = arr1[0]; // �ٶ����ֵΪ�����һ��Ԫ��
		int min1 = arr1[0]; // �ٶ���СֵΪ�����һ��Ԫ��
		for (int i = 0; i < arr1.length - 1; i += 2) {
			System.out.println("i----" + i);
			count1++;
			if (arr1[i] < arr1[i + 1]) {
				System.out.println(arr1[i] + "==" + arr1[i + 1]);
				max1 = max1 > arr1[i + 1] ? max1 : arr[i + 1];
				min1 = min1 < arr1[i] ? min1 : arr1[i];
			} else {
				System.out.println(arr1[i] + "==" + arr1[i + 1]);
				max1 = max1 > arr1[i] ? max1 : arr1[i];
				min1 = min1 < arr1[i + 1] ? min1 : arr1[i + 1];
			}
			max1 = max1 > arr1[arr1.length - 1] ? max1 : arr1[arr1.length - 1];
			min1 = min1 < arr1[arr1.length - 1] ? min1 : arr1[arr1.length - 1];
			count1++;
		}
		System.out.println("����arr1���ֵ��" + max1);
		System.out.println("����arr1��Сֵ��" + min1);
		System.out.println("ѭ������count1��" + count1);

	}

}
