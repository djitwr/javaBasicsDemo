package com.youli.javaBasicsDemo;

/**
 * ������ֵ,�Ƚ������,�߼������
 * 
 * @author admin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int a = 5;
		int b = ++a; // ++����--����ֵ���:��a�������ٸ�ֵ������b
		System.out.println("a:" + a); // a������:5+1=6
		System.out.println("b:" + b); // 6

		int c = 5;
		int d = c++; // ++����--����ֵ�ұ�:�Ƚ�c��ֵ��������d,�ٽ�����������
		System.out.println("c:" + c); // c����:5+1=6
		System.out.println("d:" + d); // �Ƚ�c=5��ֵ��������d,��dΪ5
		// ע��:�������Լ������ֻ�����ڲ�������,����ֱ�����ڲ�����ֵ����!���� 5++ �� 8-- ��д�����Ǵ����.

		System.out.println("---------------�Ƚ������-------------------");
		// �Ƚ������: (ע��:String���ǻ�����������,����������������)
		// "=="��"equals"������:"=="�Ƚϵ�������������ڴ��ַ�Ƿ�һ��;"equals()"�Ƚϵ���������������Ƿ�һ��
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc"); // newһ���µ��ַ���
		System.out.println(s1 == s2); // ���������ַ��һ����,��Ϊtrue
		System.out.println(s1 == s3); // ���������ַ��һ����,��Ϊfalse
		System.out.println(s1.equals(s3)); // �Ƚ������Ƿ�һ��,true

		System.out.println("----------------�߼������----------------------");
		// ������: & &&
		System.out.println(true && false); // ͬʱ����Ϊ��Ϊtrue
		// ������: | ||
		System.out.println(true || false); // ����һ��������Ϊtrue
		// ������: !
		System.out.println(!false); // ȡ��
		// �������: ^ һ��һ�ٲ�Ϊtrue
		System.out.println("�������:" + (true ^ false)); // true
		System.out.println("�������:" + (true ^ true)); // false

		System.out.println("----------------λ����----------------------");
		int i = 12;
		i = i << 1; // ����1λ
		System.out.println("����1λ���i:"+i);	//24

		System.out.println("----------------��Ŀ����----------------------");
		double score = 55.5;
		String mark = (score>=60)?"����":"������";
		System.out.println(mark+":"+score);

	}

}
