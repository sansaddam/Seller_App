package Demo;

public class sample {
	
	public static void main(String [] args) {
		int a[]= {10,4,6,9,20,8,1,5,7};
		for (int i = 0; i < a.length; i++) {
			if (value(a[i])) {
				System.out.println(a[i]);
			}
		}
		
		
	}
	public static boolean value(int n) {
		int count=0,pro=1;
		while (pro<=n) {
			if (n%pro==0) {
				count++;
			}
			pro++;
		}
		return count==2;	
	}

}
