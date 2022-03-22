package com.youli.javaBasicsDemo2;
/**
 * 调用方法时的参数传参
 * @author admin
 *
 */
public class DogMain {
	
	//传递的是引用的内存地址
	public void aa(MyDog myDog) {
		int age1 = myDog.getAge();
		age1 = age1 + 1;
		myDog.setAge(age1);
	}
	
	//传递值
	//局域变量，运行完就销毁了
	public void bb(int a) {
		a = a + 1;
	}

	public static void main(String[] args) {
		MyDog dog = new MyDog();
		dog.setName("小白");
		dog.setAge(2);
		System.out.println("aa方法调用前age："+dog.getAge());
		new DogMain().aa(dog);
		System.out.println("aa方法调用后age："+dog.getAge());
		
		int a1 = 10;
		System.out.println("bb方法调用前a："+a1);
		new DogMain().bb(a1);
		System.out.println("bb方法调用后a："+a1);
	}

}
