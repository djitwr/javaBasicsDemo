package com.youli.javaBasicsDemo3;

import java.util.Date;

/**
 * static�ؼ���,static�����:��һЩֻ��Ҫ����һ�εĳ�ʼ������������static������н��С�
 * 
 * @author admin
 *
 */
public class person {
	private Date birthday;
	private static Date startBirthday, endBirthday;

	static {
		startBirthday = java.sql.Date.valueOf("1946-1-1");
		endBirthday = java.sql.Date.valueOf("1964-12-31");
	}

	public person() {

	}

	public person(Date birthday) {
		this.birthday = birthday;
	}

	public String isBornBoomer() {
		//isBornBoomer�������ж�������Ƿ���1946-1964������ģ���ÿ��isBornBoomer�����õ�ʱ��
		//��������startDate��birthDate������������˿ռ��˷�
//		Date startBirthday = java.sql.Date.valueOf("1946-1-1");
//		Date endBirthday = java.sql.Date.valueOf("1964-12-31");
		return (birthday.compareTo(startBirthday) >= 0 && birthday.compareTo(endBirthday) < 0) ? "����" : "������";
	}

	public static void main(String[] args) {
		Date bb = java.sql.Date.valueOf("1999-12-21");
		person p = new person(bb);
		System.out.println(p.isBornBoomer());
	}

}
