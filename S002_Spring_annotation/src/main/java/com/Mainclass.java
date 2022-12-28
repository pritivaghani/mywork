package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		Account a = ac.getBean("savingaccount", Account.class);
		a.getbalance();
				
	Account a1 = ac.getBean("loan", Account.class);
	a1.getbalance();
	
	}

}
