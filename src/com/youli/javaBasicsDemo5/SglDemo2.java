package com.youli.javaBasicsDemo5;
/**
 * ����ģʽ:����ģʽָ������Ӧ����������������ֻ�ܴ���һ��ʵ��
 * �ܹ�����ʵ��������ظ����������ٴ���ʵ����ϵͳ��������ʡ�ڴ档
 * 
 * ����ģʽ
 * @author admin
 *
 */
public class SglDemo2 {
	
	//2.�½�����
	private static SglDemo2 sglDemo2 = null; //����ģʽ���½�����ʱ������ʼ������
	
	//1.��������˽�л��������ཫ����new����Ķ���ʵ��
	private SglDemo2() {
		
	}
	
	//3.�ṩһ���ⲿ��ȡ�������Ĺ�������
	public static SglDemo2 getInstence() {
		if(sglDemo2 == null ) {
			SglDemo2 sglDemo2 = new SglDemo2();
		}
		return sglDemo2;
	}

}
