package com.youli.javaBasicsDemo;

/**
 * ѭ�����
 * 
 * @author admin
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		// whileѭ����
//		�﷨��
//		while(ѭ������){
//			����ѭ������
//			}
//		int i = 1;
//		while(i<=100) {
////			System.out.println(i+"�ú�ѧϰ���������ϣ�");
//			i++;	//���ѭ������һֱ���㣬�ͻ������ѭ����������⣡	
//		}

		// do whileѭ����
		// �﷨��
		// do{
//		����ѭ������
//		  }while(ѭ������);
		// ���������������㣬������ִ��һ��doѭ�����
//		int a = 1;
//		while(a>100) {
//			System.out.println("whileѭ���屻ִ����");
//		}
//		do {
//			System.out.println("do.....whileѭ���屻ִ����");
//		}while(a>100);
//		
		// forѭ����
		// ����1+2+3...+100��ֵ
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		for (int i = 1; i <= 50; i++) {
			sum2 += 101;
		}
		System.out.println("���淽���ļ�������" + sum1);
		System.out.println("��˹�����ļ�������" + sum2);
		
		//forѭ������÷�
		//substring(1):ÿ��ѭ���ص�һ���ַ�
		String infor = "Thinking in java";
		for(String s = infor.substring(0);s.length()>0;s=s.substring(1)) {
//			System.out.println(s);
		}
	
	}

}
