package com.youli.javaBasicsDemo7;
/**
 * ����
 * @author admin
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		Generic<String> generic = new Generic<>("abc"); //ʵ���������ָ������
		
//		����ķ����࣬��һ��Ҫ���뷺������ʵ��ô����������������ʹ�÷��͵�ʱ��������뷺��ʵ�Σ�
//		�����ݴ���ķ���ʵ������Ӧ�����ƣ���ʱ���ͲŻ��𵽱�Ӧ�𵽵��������á�
//		��������뷺������ʵ�εĻ����ڷ�������ʹ�÷��͵ķ������Ա������������Ϳ���Ϊ�κε����͡�
		Generic generic2 = new Generic(123); 
		
	}

}
