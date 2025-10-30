package Demo;

public class distString {
	public static void main(String[] args) {
		String s="saddam";
		String d="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (d.indexOf(ch)==-1) {
				d=d+ch;
			}
		}
		//System.out.println(d);
		duplicate();
	}
	public static void duplicate() {
		String s1="saddam";
		String d1="";
		
		for (int i = 0; i < s1.length()-1; i++) {
			for (int j = i+1; j < s1.length(); j++) {
				if (s1.charAt(i)==s1.charAt(j)) {
					d1=d1+s1.charAt(i);
				}
			}
		}
		System.out.println(d1);
	}

}
