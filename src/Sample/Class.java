package Sample;

public class Class {
	public static void main(String[] args) {
		String string = "Subash";
		String rev = "";
		for(int i=string.length()-1;i>=0;i--) {
			char ch = string.charAt(i);
			rev = rev+ch;
		}
		System.out.println(rev);
		char[]ch = rev.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(i%2==0) {
				System.out.println(ch[i]);
			}
		}
	}

}
