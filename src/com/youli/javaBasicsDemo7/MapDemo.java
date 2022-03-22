package com.youli.javaBasicsDemo7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map hashMap = new HashMap();

		// Map���Ԫ��
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		hashMap.put("key4", "value4");
		hashMap.put("key5", "value5");

		// ɾ��Map�е�Ԫ��,ͨ�� key ��ֵ
		hashMap.remove("key5");

		// ͨ�� get(key) �õ� Map �е�value
		String str = (String) hashMap.get("key1");
		System.out.println("ͨ�� get(key) �õ� Map �е�value:" + str);

		// ����ͨ�� ��� �������޸�Map�е�Ԫ��
		hashMap.put("key3", "value33");

		// ͨ�� map.values() �����õ� Map �е� value ����
		Collection<String> values = hashMap.values();
		for (Object obj : values) {
			System.out.println("ͨ�� map.values() �����õ� Map �е� value ����" + obj);
		}

		System.out.println("==================");

		// ͨ�� map.keySet() �õ� Map ��key �ļ��ϣ�Ȼ�� ͨ�� get(key) �õ� Value
		Set<String> set = hashMap.keySet();
		for (String string : set) {
			Object obj2 = hashMap.get(string);
			System.out.println(string + "==" + obj2);
		}

		System.out.println("==================");

		// ͨ�� Map.entrySet() �õ� Map �� Entry���ϣ�Ȼ�����
		Set<Map.Entry<String, Object>> entrys = hashMap.entrySet();
		for (Map.Entry<String, Object> entry : entrys) {
			String key = entry.getKey();
			Object value2 = entry.getValue();
			System.out.println("ͨ�� Map.entrySet()ѭ��������" + key + "==" + value2);
		}

	}

}
