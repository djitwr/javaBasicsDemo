package com.youli.javaBasicsDemo;

import java.awt.print.Printable;

/**
 *  ����ѭ��02
 * @author admin
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		// 10�Ľ׳����
		int sum = 0;
		// ���
		for (int i = 1; i <= 10; i++) {
			int s = 1;
			for (int j = 1; j <= i; j++) {
				System.out.println("i=" + i + ";j=" + j);
				System.out.println("s=s*j=" + s + "*" + j + "=" + (s = s * j));
//				s *=j;	//s=s*j;
				System.out.println("s:" + s);
			}
			System.out.println(i + "�Ľ׳�Ϊ" + s);
			sum += s;
		}
		System.out.println("10�Ľ׳����:" + sum);

		//��ӡ�žų˷���
		//���ѭ����������
		int result = 0;
		for(int i = 1 ;i<=9;i++) {
			//�ڲ�ѭ����������
			for(int j = 1;j<=i;j++) {
				result = j * i ;
				System.out.print(j+"X"+i+"="+result+"\t");	//\t:�Ʊ����
			}
			System.out.println();	//ÿ���ڲ�ѭ���꣬����
		}
		
	}
}
