package array;

public class Md {
//
//	public static void main(String[] args) {
//		int a[][] = new int[2][3];
//		a[0][0] = 10;
//		a[0][1] = 22;
//		a[0][2] = 67;
//		a[1][0] = 33;
//		a[1][1] = 23;
//		a[1][2] = 98;
//		
//		System.out.println(a[0][2]);
//			}
//		}
//		
//	

public static void main(String[] args) {
	       int t[][] = {{22,32,32,44},{34,87,99,77},{22,56,78,56}};
	       for (int i = 0; i <3; i++)
	       {
			for (int j = 0; j <4; j++) {
				System.out.print(t[i][j]+ " ");
			}
			System.out.println();
		}
}
}