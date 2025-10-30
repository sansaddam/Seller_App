package Demo;

public class dist {
	public static void main(String[] args) {
		int a[]= {10,3,5,2,5,10};
		int v=-1;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j]=v;
				}
			}
			if (a[i]!=v) {
				//System.out.println(a[i]);
			}
		}
		duplicate();
	}
	
	public static void duplicate() {
		int a[]= {10,3,5,2,5,10,2};
		int v=-1;
		for (int i = 0; i < a.length-1; i++) {
			int count=0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
					a[j]=v;
				}
			}
			if (a[i]!=v && count>0) {
				System.out.println(a[i]);
			}
		}
	}
}
