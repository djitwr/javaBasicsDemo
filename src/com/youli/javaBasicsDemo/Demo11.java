package com.youli.javaBasicsDemo;

import java.util.Arrays;

/**
 * java常用算法 冒泡排序
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
		int compareRange = arr.length - 1; // 比较数字的边界
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= compareRange; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1]; // 最大的先放入temp中
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			compareCounter++;
		}
		System.out.println("原数组冒泡排序后的数组：" + Arrays.toString(arr));
		System.out.println("原数组排序次数：" + compareCounter);
	}

	// 如果在一趟排序中，数组元素没有发生过交换说明数组已经有序，跳出循环即可。优化后的代码如下：
	public static void bubbleSort2() {
		int compareCounter = 0;
		int arr[] = { 11, 9, 96, 1, 29, 3, 2, 17, 19, 23, 10 };
		int temp = 0;
		int compareRange = arr.length - 1; // 比较数字的边界
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = 1; j <= compareRange; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1]; // 最大的先放入temp
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			compareCounter++;
		}
		System.out.println("优化后的冒泡排序后的数组：" + Arrays.toString(arr));
		System.out.println("优化后的排序次数：" + compareCounter);

	}

}
