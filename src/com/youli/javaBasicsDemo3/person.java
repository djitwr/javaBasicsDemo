package com.youli.javaBasicsDemo3;

import java.util.Date;

/**
 * static关键字,static代码块:将一些只需要进行一次的初始化操作都放在static代码块中进行。
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
		//isBornBoomer是用来判断这个人是否是1946-1964年出生的，而每次isBornBoomer被调用的时候，
		//都会生成startDate和birthDate两个对象，造成了空间浪费
//		Date startBirthday = java.sql.Date.valueOf("1946-1-1");
//		Date endBirthday = java.sql.Date.valueOf("1964-12-31");
		return (birthday.compareTo(startBirthday) >= 0 && birthday.compareTo(endBirthday) < 0) ? "符合" : "不符合";
	}

	public static void main(String[] args) {
		Date bb = java.sql.Date.valueOf("1999-12-21");
		person p = new person(bb);
		System.out.println(p.isBornBoomer());
	}

}
