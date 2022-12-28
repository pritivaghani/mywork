package com;

import org.springframework.stereotype.Component;

@Component("secret")
public class Secretinfo implements User {

	public void basicinfo() {
System.out.println("secret info for saving account.....");		
	}

}
