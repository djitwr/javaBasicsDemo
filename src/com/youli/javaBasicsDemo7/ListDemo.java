package com.youli.javaBasicsDemo7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List���ϣ����򣬿����ظ��ļ��� 
 * ��������ʵ�֣�ArrayList���ײ����ݽṹ�����飬��ѯ�죬��ɾ��; �̲߳���ȫ��Ч�ʸ�
 * 
 * Set���ϣ������ظ��ļ���
 * ��������ʵ�֣�HashSet()��һ�����򣬲����ظ��ļ���
 * @author admin
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		// List�������Ԫ�أ�add����
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		// List�������ָ��λ��Ԫ�أ�add(����,Ҫ����Ԫ�ص�ֵ)����
		list.add(3, 33);

		// ��ָ���ط��滻Ԫ�� set(����,Ҫ�滻ԭĿ���ֵ)
		list.set(3, "a");

		// ���ָ����������� indexOf(Ԫ��)
		int i = list.indexOf("a");
		System.out.println("���ָ�����������:" + i);
		
		//ForEachѭ������
		for(Object obj : list) {
			System.out.println("ForEachѭ��������" + obj);
		}

		// Iterator�����ӿ�ѭ����������
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("ʹ��Iteratorѭ��������" + iterator.next());
		}

	}

}
