package com.youli.javaBasicsDemo;

/**
 * �������ͺ�����ת�� ע��:String���ǻ�����������,����������������
 * 
 * @author admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
//		int a = 3;
//		double b = 3.14;
//		float c = 3.14f;
//		char d = '��';
//		String e = "������9.20��";
//		System.out.println("a:"+a+",b:"+b+",c:"+c+",d:"+d);
//		System.out.println("�ַ���e�ĳ��ȣ�"+e.length());

		// 1)�Զ�����ת��
		// ASCLL�Զ�ת��
		int i = 'a'; // char�����Զ�ת��Ϊʮ����
//		System.out.println(i);
		char d = 123;  //123-->{
		System.out.println("d:"+d);
		
		String str = "123"; // �ַ���+int���ͣ�ƴ��Ϊ�ַ���
		int a = 2;
//		System.out.println(str+a);
		int stri = Integer.parseInt(str); // ���ַ�������ת��Ϊint����
//		System.out.println(stri+a); //�ӷ�����

		// 2)ǿ������ת��
		long b = 150;
//		int c = (int)b; //��תС:��Ҫǿ������ת��
		byte c = (byte) b; // �����ĳ���ת�����͵ķ�Χ�������,���ݻᶪʧ;byte��ΧΪ-128~127
		System.out.println("DD======DD"+c);

//		���ʽ���͵��Զ�����
//		��һ���������ʽ��������������͵�ֵʱ�������������ʽ���������ͽ������Զ�������
//		Java���������µ��Զ���������:
//		1).���е�byte���ͣ�short���ͺ�char���ͽ���������int���͡�
//		2).�����������ʽ�����������Զ����������ʽ����ߵȼ�������ͬ�������͡�
		short aa = 20;
		System.out.println((aa + a));
		System.out.println(getType((aa + a)));

//		ת���ַ���������ʾ����ķ��Ż���������
//		\b ����ʾ����һ���ַ�
//		\t ����ʾһ���Ʊ�λ
//		\n ����ʾ������һ��
//		\r : �س�
//		\" ����ʾ˫����
//		\' ����ʾ������
//		\\ ����ʾ��б���ַ�\
		System.out.println("����˵:\"���!\"");
	}
	// ��ȡ�������͵ķ���:
	static String getType(Object o) {
		return o.getClass().toString(); //
	}

}
