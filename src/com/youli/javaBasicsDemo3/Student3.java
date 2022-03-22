package com.youli.javaBasicsDemo3;
/**
 * this关键字：(3)this调用本类中的其他构造方法，调用时要放在构造方法的首行。
 * @author admin
 *
 */
public class Student3 {
	private String name;
	private int age;
	
	public Student3() {
		this("小白"); //前一行不能有任何代码
	}
	
	public Student3(String name) {
		System.out.println("我的名字叫："+name);
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
