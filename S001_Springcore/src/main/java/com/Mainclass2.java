package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass2 {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Applicationcontext1.xml");
		
		Employee emp = ac.getBean(Employee.class, "emp");
		emp.display();
	}

}
