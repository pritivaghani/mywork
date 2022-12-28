package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Savingaccount implements Account
{
   @Autowired
   @Qualifier("secret")
	User u;
	
	public void getbalance() {
    System.out.println("saving account balance calling....");		
	u.basicinfo();
	
	}

	
	
}
