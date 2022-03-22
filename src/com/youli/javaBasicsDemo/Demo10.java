package com.youli.javaBasicsDemo;

/**
 * java常用算法 比较求出数组中的最大值
 * 
 * @author admin
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int[] arr = { 29, 2, 49, 13, 15, 33, 59, 19, 99 };
		int max = arr[0]; // 假定最大值为数组第一组元素
		int min = arr[0]; // 假定最小值为数组第一组元素
		int count = 0;
		int count1 = 0;
		// 一个一个比较
		for (int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
			count++;
		}
		for (int i = 0; i < arr.length; i++) {
			min = min < arr[i] ? min : arr[i];
			count++;
		}
		System.out.println("数组arr最大值：" + max);
		System.out.println("数组arr最小值：" + min);
		System.out.println("循环次数count：" + count);

		// 两两对比，减少循环次数
		int[] arr1 = { 29, 2, 49, 13, 15, 33, 59, 19, 99 };
		int max1 = arr1[0]; // 假定最大值为数组第一组元素
		int min1 = arr1[0]; // 假定最小值为数组第一组元素
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
		System.out.println("数组arr1最大值：" + max1);
		System.out.println("数组arr1最小值：" + min1);
		System.out.println("循环次数count1：" + count1);

	}

}
