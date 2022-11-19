package otp;

import java.util.Random;

public class OTP_demo {
      
	public static void main(String[] args) {
          
		// for otp 
		
		Random r = new Random();
		int otp = r.nextInt(9999);
		
		System.out.println("yoyr otp is : "+otp);
	}

}
