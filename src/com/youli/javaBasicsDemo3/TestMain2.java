package com.youli.javaBasicsDemo3;
/**
 * this关键字： (2)this调用本类中的其他方法
 * @author admin
 *
 */
public class TestMain2 {
	public static void main(String[] args) {
		new TestMain2().aaa();
	}
	
	public void aaa() {
		this.bbb(); //this通常可以省略：bbb()
	}
	
	public void bbb() {
		System.out.println("bbb方法被执行了！");
	}
	
	
}
