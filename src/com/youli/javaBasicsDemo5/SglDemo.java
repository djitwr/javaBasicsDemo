package com.youli.javaBasicsDemo5;
/**
 * ����ģʽ:����ģʽָ������Ӧ����������������ֻ�ܴ���һ��ʵ��
 * �ܹ�����ʵ��������ظ����������ٴ���ʵ����ϵͳ��������ʡ�ڴ档
 * 
 * ����ģʽ
 * @author admin
 *
 */
public class SglDemo {
	
	//2.�½�����
	private static SglDemo sglDemo = new SglDemo();//����ģʽ���½�����ʱ���ͳ�ʼ������
	
	//1.��������˽�л��������ཫ����new����Ķ���ʵ��
	private SglDemo() {
		
	}
	
	//3.�ṩһ���ⲿ��ȡ�������Ĺ�������
	public static SglDemo getInstence() {
		return sglDemo;
	}

}
