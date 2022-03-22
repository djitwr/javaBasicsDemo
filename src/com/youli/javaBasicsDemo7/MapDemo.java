package com.youli.javaBasicsDemo7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map hashMap = new HashMap();

		// Map添加元素
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		hashMap.put("key4", "value4");
		hashMap.put("key5", "value5");

		// 删除Map中的元素,通过 key 的值
		hashMap.remove("key5");

		// 通过 get(key) 得到 Map 中的value
		String str = (String) hashMap.get("key1");
		System.out.println("通过 get(key) 得到 Map 中的value:" + str);

		// 可以通过 添加 方法来修改Map中的元素
		hashMap.put("key3", "value33");

		// 通过 map.values() 方法得到 Map 中的 value 集合
		Collection<String> values = hashMap.values();
		for (Object obj : values) {
			System.out.println("通过 map.values() 方法得到 Map 中的 value 集合" + obj);
		}

		System.out.println("==================");

		// 通过 map.keySet() 得到 Map 的key 的集合，然后 通过 get(key) 得到 Value
		Set<String> set = hashMap.keySet();
		for (String string : set) {
			Object obj2 = hashMap.get(string);
			System.out.println(string + "==" + obj2);
		}

		System.out.println("==================");

		// 通过 Map.entrySet() 得到 Map 的 Entry集合，然后遍历
		Set<Map.Entry<String, Object>> entrys = hashMap.entrySet();
		for (Map.Entry<String, Object> entry : entrys) {
			String key = entry.getKey();
			Object value2 = entry.getValue();
			System.out.println("通过 Map.entrySet()循环遍历：" + key + "==" + value2);
		}

	}

}
