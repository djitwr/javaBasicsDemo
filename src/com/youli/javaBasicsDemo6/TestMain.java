package com.youli.javaBasicsDemo6;

public class TestMain {
	public static void main(String[] args) {
		Day[] days = Day.values(); //values()���������þ��ǻ�ȡö�����е����б���������Ϊ���鷵�أ�ö�����ͳ�������һ��������
		for (Day day : days) { //ѭ����������
			System.out.println(day);
		}
		
		Day monday = Day.valueOf("MONDAY"); //valueOf�������ص�ֵ����monday����
		System.out.println(monday); //ǿ��������̨������������ַ�������MONDAY������һ����������

	}

}
