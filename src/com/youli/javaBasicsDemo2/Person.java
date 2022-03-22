package com.youli.javaBasicsDemo2;
/**
 * 构造方法（构造函数）
 * @author admin
 *
 */
public class Person {
	private int age;
	private String name;
	private String sex;
	
	//系统默认生产的空构造（一旦显示地写出了有参数的构造方法，则系统不会生成空构造方法）
	//无参数的空构造！！！！！！！！！！很多框架（真正的企业级的项目开发，都是要用框架来进行开发，这些框架一般情况下都会调用类里的空构造！）
	public Person() {
		
	}
	
	//构造方法
	public Person(int age,String name,String sex) {
		//默认的构造方法里什么都没有，一般情况下写出构造函数的目的：初始化
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	

}
