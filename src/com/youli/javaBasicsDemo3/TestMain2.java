package com.youli.javaBasicsDemo3;
/**
 * this�ؼ��֣� (2)this���ñ����е���������
 * @author admin
 *
 */
public class TestMain2 {
	public static void main(String[] args) {
		new TestMain2().aaa();
	}
	
	public void aaa() {
		this.bbb(); //thisͨ������ʡ�ԣ�bbb()
	}
	
	public void bbb() {
		System.out.println("bbb������ִ���ˣ�");
	}
	
	
}
