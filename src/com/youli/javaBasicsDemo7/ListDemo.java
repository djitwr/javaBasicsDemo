package com.youli.javaBasicsDemo7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合：有序，可以重复的集合 
 * 经常典型实现：ArrayList：底层数据结构是数组，查询快，增删慢; 线程不安全，效率高
 * 
 * Set集合：不可重复的集合
 * 经常典型实现：HashSet()是一个无序，不可重复的集合
 * @author admin
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		// List集合添加元素：add方法
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		// List集合添加指定位置元素：add(索引,要插入元素的值)方法
		list.add(3, 33);

		// 在指定地方替换元素 set(索引,要替换原目标的值)
		list.set(3, "a");

		// 获得指定对象的索引 indexOf(元素)
		int i = list.indexOf("a");
		System.out.println("获得指定对象的索引:" + i);
		
		//ForEach循环遍历
		for(Object obj : list) {
			System.out.println("ForEach循环遍历：" + obj);
		}

		// Iterator顶级接口循环遍历集合
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("使用Iterator循环遍历：" + iterator.next());
		}

	}

}
