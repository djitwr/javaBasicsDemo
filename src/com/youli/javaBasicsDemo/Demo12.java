package com.youli.javaBasicsDemo;
/**
 * java�����㷨 ѡ�������㷨
 * @author admin
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
		selectionSort(b);
		for (int i : b) { // foreachѭ����������
			System.out.print(i + " ");
		}
	}

	public static void selectionSort(int[] a) {
		int n = a.length;
		// �ҳ���Сֵ���±�
		for (int i = 0; i < n; i++) {
			int k = i;
			for (int j = i + 1; j < n; j++) {
				k = a[k] < a[j] ? k : j;
			}
			if (k > i) { // ��ʵ����Сֵ�ͼ������Сֵ�����滻
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}

}
