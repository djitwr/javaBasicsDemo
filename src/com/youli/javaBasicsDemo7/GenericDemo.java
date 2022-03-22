package com.youli.javaBasicsDemo7;
/**
 * 泛型
 * @author admin
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		Generic<String> generic = new Generic<>("abc"); //实例化对象就指定类型
		
//		定义的泛型类，就一定要传入泛型类型实参么？并不是这样，在使用泛型的时候如果传入泛型实参，
//		则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。
//		如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
		Generic generic2 = new Generic(123); 
		
	}

}
