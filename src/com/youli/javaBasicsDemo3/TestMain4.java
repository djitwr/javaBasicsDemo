package com.youli.javaBasicsDemo3;
/**
 * static�ؼ���,��ͨ��this���ʾ�̬��Ա������:��̬��Ա������Ȼ�����ڶ��󣬵��ǲ���������ͨ������ȥ���ʣ�
 * ���еľ�̬�����;�̬����������ͨ��������ʣ�ֻҪ����Ȩ���㹻����
 * @author admin
 *
 */
public class TestMain4 {
	static int value = 33;
	public static void main(String[] args) {
		new TestMain4().printValue();
	}
	
	private void printValue() {
		int value = 3;
		System.out.println(this.value);
	}

}
