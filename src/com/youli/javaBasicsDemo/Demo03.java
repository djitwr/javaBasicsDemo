package com.youli.javaBasicsDemo;

public class Demo03 {
	public static void main(String[] args) {
//		double score = 59.5;
//		String mark = (score >= 60) ? "����" : "������";
//		System.out.println(mark + ":" + score);
//
//		if (score >= 80) {
//			System.out.println("�ɼ�����:" + score);
//		} else if (score >= 60) {
//			System.out.println("�ɼ�����:" + score);
//		} else {
//			System.out.println("������:" + score);
//		}

		/**
		 * case�������д��break�����벻�ᱨ�� ���ǻ�һֱִ��֮������case�����µ���䣬�����ٽ����жϣ�ֱ��default���
		 */
		char sex = 'Ů';
		switch (sex) {
		case '��':
			System.out.println("����");
//			break;
		case 'Ů':
			System.out.println("Ů��");
//			break;
		default:
			System.out.println("�Ա�δ֪��");
//			break;
		}

	}
}
