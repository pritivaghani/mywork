package com;

import org.springframework.stereotype.Component;

@Component("personal")
public class Personalinfo implements User {

	public void basicinfo() {
		System.out.println("personalinfo for saving account....");
	}

}
