package com.youli.javaBasicsDemo4;
/**
 * 引用变量的类型强制转换和instanceof运算符
 * @author admin
 *
 */
public class BsTestMain {
	public static void main(String[] args) {
		Base base = new Sub(); //多态
		base.say(); //多态，会调用子类重写的方法
//		base.read(); //会报错：父类引用变量不能调用它子类的特有的方法
		
		if(base instanceof Sub) { ///先判断能否转换成功
			//java 中的instanceof：
			//运算符是用来在运行时指出对象是否是特定类的一个实例。
			//instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。
			
			((Sub) base).read(); //强制转换为之类类型
			//把父类实例转换成子类类型，则这个对象必须实际上是子类实例才行，
			//否则将在运行时引发ClassCastException。
		}
	}
}
