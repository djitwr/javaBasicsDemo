package com.youli.javaBasicsDemo2;
/**
 * ���÷���ʱ�Ĳ�������
 * @author admin
 *
 */
public class DogMain {
	
	//���ݵ������õ��ڴ��ַ
	public void aa(MyDog myDog) {
		int age1 = myDog.getAge();
		age1 = age1 + 1;
		myDog.setAge(age1);
	}
	
	//����ֵ
	//����������������������
	public void bb(int a) {
		a = a + 1;
	}

	public static void main(String[] args) {
		MyDog dog = new MyDog();
		dog.setName("С��");
		dog.setAge(2);
		System.out.println("aa��������ǰage��"+dog.getAge());
		new DogMain().aa(dog);
		System.out.println("aa�������ú�age��"+dog.getAge());
		
		int a1 = 10;
		System.out.println("bb��������ǰa��"+a1);
		new DogMain().bb(a1);
		System.out.println("bb�������ú�a��"+a1);
	}

}
