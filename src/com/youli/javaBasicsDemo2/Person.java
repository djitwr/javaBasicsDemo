package com.youli.javaBasicsDemo2;
/**
 * ���췽�������캯����
 * @author admin
 *
 */
public class Person {
	private int age;
	private String name;
	private String sex;
	
	//ϵͳĬ�������Ŀչ��죨һ����ʾ��д�����в����Ĺ��췽������ϵͳ�������ɿչ��췽����
	//�޲����Ŀչ��죡�������������������ܶ��ܣ���������ҵ������Ŀ����������Ҫ�ÿ�������п�������Щ���һ������¶����������Ŀչ��죡��
	public Person() {
		
	}
	
	//���췽��
	public Person(int age,String name,String sex) {
		//Ĭ�ϵĹ��췽����ʲô��û�У�һ�������д�����캯����Ŀ�ģ���ʼ��
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	

}
