package com.youli.javaBasicsDemo;

import java.awt.print.Printable;

/**
 *  ѭ������е�break��continue��return
 * @author admin
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		//һ��ʹ��break����ѭ��
		//1.���ã���ĳ����������ʱǿ����ֹѭ����������ȫ����һ��ѭ��������ѭ���塣
		for(int i = 1;i<=10;i++) {
			if(i==4) {
				break;
				//������ִ��i=5.... ֱ������ѭ��
			}
			System.out.println(i);
		}
		
		//2.break�������Խ������ڵ�ѭ����������ֱ�ӽ��������ѭ������Ҫ��break�������һ����ǩ�������ǩ���ڱ�ʾһ�����ѭ������ǩ��һ����������� ����ʶ����
		//��ǩֻ�з���ѭ�����֮ǰ�����ã�
		other:
		for(int i = 1;i<=10;i++) {
			System.out.println("i:"+i);
			for(int j = 1;j<=10;j++) {
				if(j==5) {
					break other;
					//����outer��ǩ����ʶ��ѭ��
				}
				System.out.println("j:"+j);
			}
		}
		
		//����ʹ��continue���Ա���ѭ��ʣ�����
		for(int i = 1;i<=10;i++) {
			if(i == 3) {
				continue;	//i����3ʱ������ִ���·�����䣬���ǻ����i=4ѭ��
			}
			System.out.println("Hello!"+i);
			
		}
		
		
	}
}
