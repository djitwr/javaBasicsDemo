package com.youli.javaBasicsDemo;

import java.util.Arrays;


/**
 * 数组
 * 
 * @author admin
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		int arr[] = { 10, 2, 8, 9, 13, 16, 7 };
//		System.out.println(arr[0]);
		// for循环遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println("for循环遍历数组arr:" + arr[i]);
		}

		// foreach循环遍历数组
		for (int i : arr) {
			System.out.println("foreach循环遍历数组arr:" + i);
		}

		// Arrays工具类对数组的元素的打印
		System.out.println("Arrays工具类对数组的元素的打印" + Arrays.toString(arr)); // [10, 2, 8, 9, 13, 16, 7]

		// 打印字母三角形
		char[] arr1 = { 'A', 'B', 'C', 'D' };
		// 三角形的层数
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print(arr1[i]);
			}
			System.out.println();
		}

		// 二维数组
		int[][] arr2 = { { 1, 2, 6 }, { 9, 8, 1 }, { 2, 3 }, { 3 }, { 29, 13, 12 } };
		for (int i = 0; i < arr2.length; i++) { // 遍历出的元素是一个一堆数组
			for (int j = 0; j < arr2[i].length; j++) { // 遍历对应位置上的一维数组
//				System.out.print("二维数组遍历：" + arr2[i][j] + "\t,");
			}
		}
		//Arrays.deepToString()可直接遍二维数组
		System.out.println(Arrays.deepToString(arr2));

	}

}
