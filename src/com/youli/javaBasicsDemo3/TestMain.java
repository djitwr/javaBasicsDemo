package com.youli.javaBasicsDemo3;
/**
 * ��������
 * @author admin
 *
 */
public class TestMain {
	public static void main(String[] args) {
		int[] intArr = {2,6,1,22,5}; //��������������ɵ���ֵ
		//�������ö�������������
		Student[] stuArr = new Student[5]; //������һ��ѧ�����͵���ֵ
		
		//�������;��ǡ������������͡�
		
		Student stu1 = new Student(1,"����");
		Student stu2 = new Student(2,"����");
		Student stu3 = new Student(3,"����");
		Student stu4 = new Student(4,"����");
		Student stu5 = new Student(5,"����");
		
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		stuArr[3] = stu4;
		stuArr[4] = stu5;
		//ѭ��������������
		for(int i =0; i < stuArr.length;i++) {
			System.out.println(stuArr[i]);
		}
		
	}
}
