package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		
		//Student std = new Student();
		Student std = ac.getBean(Student.class, "std");
		std.display();
	}

}
