package com.youli.javaBasicsDemo3;
/**
 * 对象数组
 * @author admin
 *
 */
public class TestMain {
	public static void main(String[] args) {
		int[] intArr = {2,6,1,22,5}; //基本数据类型组成的数值
		//还可以用对象来构造数组
		Student[] stuArr = new Student[5]; //定义了一个学生类型的数值
		
		//这种类型就是“引用数据类型”
		
		Student stu1 = new Student(1,"张三");
		Student stu2 = new Student(2,"李四");
		Student stu3 = new Student(3,"王五");
		Student stu4 = new Student(4,"甜心");
		Student stu5 = new Student(5,"张伍");
		
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		stuArr[3] = stu4;
		stuArr[4] = stu5;
		//循环遍历对象数组
		for(int i =0; i < stuArr.length;i++) {
			System.out.println(stuArr[i]);
		}
		
	}
}
