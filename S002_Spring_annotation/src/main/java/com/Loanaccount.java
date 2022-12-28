package com;

import org.springframework.stereotype.Component;

@Component("loan")
public class Loanaccount implements Account
{

	public void getbalance() {

		System.out.println("loan account balnce calling....");
	}

	
}
