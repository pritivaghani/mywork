package impractical;

public class Armstrongnumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		  while (num!=0)  {
			  int rem = num%10;
			  sum = sum+(rem*rem*rem);
			  num = num/10;
			  
		  }
		  if (sum==temp)
		  {
			  System.out.println("armstrong number");
		  }
		  else 
		  {
			  System.out.println("not armstrong number");
		  }
	}

}
