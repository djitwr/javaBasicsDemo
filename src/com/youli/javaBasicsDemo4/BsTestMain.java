package com.youli.javaBasicsDemo4;
/**
 * ���ñ���������ǿ��ת����instanceof�����
 * @author admin
 *
 */
public class BsTestMain {
	public static void main(String[] args) {
		Base base = new Sub(); //��̬
		base.say(); //��̬�������������д�ķ���
//		base.read(); //�ᱨ���������ñ������ܵ�������������еķ���
		
		if(base instanceof Sub) { ///���ж��ܷ�ת���ɹ�
			//java �е�instanceof��
			//�����������������ʱָ�������Ƿ����ض����һ��ʵ����
			//instanceofͨ������һ������ֵ��ָ������������Ƿ�������ض�����������������һ��ʵ����
			
			((Sub) base).read(); //ǿ��ת��Ϊ֮������
			//�Ѹ���ʵ��ת�����������ͣ�������������ʵ����������ʵ�����У�
			//����������ʱ����ClassCastException��
		}
	}
}
