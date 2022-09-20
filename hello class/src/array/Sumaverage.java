package array;

public class Sumaverage {

	public static void main(String[] args) {
		   int a[] = {26,47,57,89,30,38,84};
	       int sum =0;
	       
	       for (int i=0;i<a.length;i++)       {   	  
	 	   sum += a[i];
	 	 
	       }
	       System.out.println("total :"+sum);
	       System.out.println("average :"+sum/a.length);
		}
	
	}

