package com.youli.javaBasicsDemo3;
/**
 * this�ؼ��֣�(3)this���ñ����е��������췽��������ʱҪ���ڹ��췽�������С�
 * @author admin
 *
 */
public class Student3 {
	private String name;
	private int age;
	
	public Student3() {
		this("С��"); //ǰһ�в������κδ���
	}
	
	public Student3(String name) {
		System.out.println("�ҵ����ֽУ�"+name);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}
	
}
