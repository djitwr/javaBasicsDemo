package com.youli.javaBasicsDemo7;

/**
 * Collection���ϣ����÷�����Collection����ѭ������
 * ʹ��ArrayList����ʵ��
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList(); //ʹ��ArrayList����ʵ��

		// Collection�������Ԫ�أ�add����
		collection.add("����");
		collection.add("����");
		collection.add("����");

		// ʹ��Iterator�����ӿ�ѭ����������collection
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println("iterator������" + name);
		}
		
		//ɾ������
		collection.remove("����");
		
		//ɾ������Ԫ��
//		collection.removeAll(collection);
		
		//����Ƿ����ĳ��Ԫ��
		System.out.println(collection.contains("����"));
		
		//�жϼ����Ƿ�Ϊ��
		System.out.println(collection.isEmpty());

		// ForEachѭ������iterator����
		for (Object object : collection) {
			System.out.println("ForEachѭ���������ϣ�" + object);
		}

	}

}
