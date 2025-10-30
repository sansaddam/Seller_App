package Demo;

public class numberseries {
	public static void main(String[] args) {
		int n=6,pro=1,sum=0;
		while (pro<n) {
			if (n%pro==0) {
				sum=sum+pro;
			}
			pro++;
		}
		//System.out.println(sum);
		prime();
		power();
		reverse();
		strong();
		armStrong();
	}
	public static void prime() {
		int n=7,pro=1,count=0;
		while (pro<=n) {
			if (n%pro==0) {
				count++;
			}
			pro++;
		}
		if (count==2) {
			System.out.println("prime");
		}
	}
	public static void power() {
		int x=2,n=3;
		int pro=1;
		while (n!=0) {
			pro=pro*x;
			n--;
		}
		System.out.println(pro);
	}
	public static void reverse() {
		int n=234;
		int rev=0;
		while (n!=0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void strong() {
		int n=145,sum=0,temp=n;
		while (n!=0) {
			int rem= n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		System.out.println(sum);
		if (temp==sum) {
			System.out.println("Strong");
		}
	}
//	Factorial
	public static int fact(int n) {
		int result=1;
		for (int i = 1; i <=n; i++) {
			result=result*i;
		}
		return result;
	}
//	Cubes
	public static int cubes(int n) {
		int result=1;
		for (int i = 1; i <=3; i++) {
			result=result*n;
		}
		return result;
	}
	public static void armStrong() {
		int n=153,temp=n,sum=0;
		while (n!=0) {
			int rem=n%10;
			sum=sum+cubes(rem);
			n=n/10;
		}
		if (sum==temp) {
			System.out.println("Arm Strong");
		}
	}
	
}
