package com.youli.javaBasicsDemo5;

public class SglDemoTest {
	//���ۻ�ȡ���ٴ�SglDemo2���󣬶���ͬһ������
	public static void main(String[] args) {
		SglDemo sglDemo = SglDemo.getInstence();
		SglDemo sglDemo2 = SglDemo.getInstence();
		//�ж����������Ƿ���һ������
		//��==��:�Ƚ��ڴ��ַ�Ƿ�һ��
		System.out.println(sglDemo == sglDemo2); //ture

	}

}
