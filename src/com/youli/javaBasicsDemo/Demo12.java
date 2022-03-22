package com.youli.javaBasicsDemo;
/**
 * java常用算法 选择排序算法
 * @author admin
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
		selectionSort(b);
		for (int i : b) { // foreach循环遍历数组
			System.out.print(i + " ");
		}
	}

	public static void selectionSort(int[] a) {
		int n = a.length;
		// 找出最小值的下标
		for (int i = 0; i < n; i++) {
			int k = i;
			for (int j = i + 1; j < n; j++) {
				k = a[k] < a[j] ? k : j;
			}
			if (k > i) { // 将实际最小值和假设的最小值进行替换
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}

}
