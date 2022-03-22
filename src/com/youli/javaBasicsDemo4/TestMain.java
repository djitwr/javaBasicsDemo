package com.youli.javaBasicsDemo4;
/**
 * 多态
 * @author admin
 *
 */
public class TestMain {
	public static void main(String[] args) {
		Wine a = new Wine(); //声明对象和赋值对象是同种类型，则不存在多态
		Wine b = new JNC(); //声明对象和赋值对象是不同种类型，则存在多态
		
//		b.fun1("asdf"); //会报错
		//原因：
		//父类中没有含参数的fun1方法，向上转型后会丢失子类里的特有方法，
		//所以用JNC这个类的对象的Wine类型引用是不能引用有参数的fun1(String a)方法。
		
		
		b.fun1();
		//运行结果：
		//Wine的fun1方法...
		//JNC的fun2方法...
		
//		从程序的运行结果中我们发现，a.fun1()首先是运行父类Wine中的fun1().然后再运行子类JNC中的fun2()。
//		分析：在这个程序中子类JNC重载了父类Wine的方法fun1()，重写fun2()，而且重载后的fun1(String a)与 fun1()不是同一个方法，
//		父类中没有含参数的fun1方法，向上转型后会丢失子类里的特有方法，所以用JNC这个类的对象的Wine类型引用是不能引用有参数的fun1(String a)方法。而子类JNC重写了fun2() ，那么指向JNC的Wine引用会优先调用JNC中fun2()方法。
//
//		所以对于多态我们可以总结如下：
//		指向子类的父类引用由于向上转型了，它只能访问父类中拥有的方法和属性，而对于子类中存在而父类中不存在的方法，该引用是不能使用的，
//		尽管是重载该方法。若子类重写了父类中的某些方法，在调用该些方法的时候，必定是使用子类中定义的这些方法，他们优先级高于父类中的方法。
		
	}

}
