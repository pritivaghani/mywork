package array;

import java.util.Iterator;

public class ArrayCopy {

public static void main(String[] args) {
	      int a[] = {10,56,87,39,87,37,87,48};
	      int b[] = new int[7];
	        System.arraycopy(a,2,b,1,5);
	     for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
				
			}
}
