package com.youli.javaBasicsDemo7;

/**
 * Collection集合，常用方法，Collection集合循环遍历
 * 使用ArrayList典型实现
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList(); //使用ArrayList典型实现

		// Collection集合添加元素：add方法
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");

		// 使用Iterator顶级接口循环遍历集合collection
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println("iterator遍历：" + name);
		}
		
		//删除方法
		collection.remove("李四");
		
		//删除所有元素
//		collection.removeAll(collection);
		
		//检测是否存在某个元素
		System.out.println(collection.contains("张三"));
		
		//判断集合是否为空
		System.out.println(collection.isEmpty());

		// ForEach循环遍历iterator集合
		for (Object object : collection) {
			System.out.println("ForEach循环遍历集合：" + object);
		}

	}

}
