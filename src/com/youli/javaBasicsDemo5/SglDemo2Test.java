package com.youli.javaBasicsDemo5;

public class SglDemo2Test {
	public static void main(String[] args) {
		//���ۻ�ȡ���ٴ�SglDemo2���󣬶���ͬһ������
		SglDemo2 sglDemo2 = SglDemo2.getInstence();
		SglDemo2 sglDemo22 = SglDemo2.getInstence();
		//�ж����������Ƿ���һ������
		//��==��:�Ƚ��ڴ��ַ�Ƿ�һ��
		System.out.println(sglDemo2 == sglDemo22); //ture
	}
}
