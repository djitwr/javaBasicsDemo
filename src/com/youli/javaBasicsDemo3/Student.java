package com.youli.javaBasicsDemo3;

public class Student {
	private int stuNo;
	private String name;
	
	//构造方法，初始化对象
	public Student() {

	}
	
	public Student(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + "]";
	}

}
