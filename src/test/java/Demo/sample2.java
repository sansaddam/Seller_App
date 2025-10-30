package Demo;

public class sample2 {
	public static void main(String[] args) {
		int[] a= {10,2,5,9,10,25,6};
		int max=a[0];
		int smax=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				smax=max;
				max=a[i];
			}
			if (a[i]>smax && a[i]<max) {
				smax=a[i];
			}
		}
		System.out.println("smax  " +smax);
		smin();
	}
	public static void smin() {
		int[] a= {10,2,5,9,2,10,25,6};
		int min=a[0];
		int smin=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				smin=min;
				min=a[i];
			}
			if (a[i]<smin && a[i]>min) {
				smin=a[i];
			}
		}
		System.out.println("smin  "+ smin);
	}

}
