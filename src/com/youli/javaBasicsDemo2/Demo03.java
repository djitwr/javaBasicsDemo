package com.youli.javaBasicsDemo2;
/**
 * ������������ͱ�����ʼ��˳��
 * @author admin
 *
 */
public class Demo03 {
	private static int a;
	public static void main(String[] args) {
		modify(a);
		System.out.println(a);
	}

	public static void modify(int a) {
		a++;
	}

}
