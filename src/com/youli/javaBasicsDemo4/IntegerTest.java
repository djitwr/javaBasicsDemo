package com.youli.javaBasicsDemo4;

/**
 * ��װ���JDK1.5���Զ���װ��
 * 
 * @author admin
 *
 */
public class IntegerTest {
	public static void main(String[] args) {
		//int��integer��֮���ת�� 
		int n = 10;
		Integer n1 = new Integer(n);
		System.out.println("int����ת��Ϊinteger���ͣ�" + n1);
		
		Integer i = new Integer(50);
		int i1 = i.intValue();
		System.out.println("integer����ת��Ϊint���ͣ�" + i);
		
		//JDK1.5���Զ���װ�䣺����Ҫ�����鷳����������ʹ�ú͸�ֵһ���ķ�����ֱ��ת��������ԭ�������ԭ��һ��
		//�Զ�װ�䣺�� ������������ ��װΪ�������ͣ�������java����������˼�롣 
		//�Զ����䣺����������ת��Ϊ������������
		int ii = 122;
		Integer iii = 222;
		ii = iii;
		
		//�ַ�����(int)integer��֮���ת��
		String str = "123";
		Integer stri = Integer.parseInt(str);
		System.out.println("�ַ�����(int)integer��֮���ת��stri��" + stri);
		
		Integer i2 = new Integer(111);
		String string = stri.toString(i2);
		System.out.print("�ַ�����(int)integer��֮���ת��string��" + string);
		
	}

}
