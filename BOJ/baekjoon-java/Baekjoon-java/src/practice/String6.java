package practice;

public class String6 {
	public static void main(String[] args) {
		String s1 = "pizza";
		String s2 = new String("pizza");
		String s3 = "chicken";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s4 = s1.substring(0,2);	// pizza -> pi
		char c = s1.charAt(4);	// a
		
		System.out.println(3+4+s4+c+5);	// 7pia5
	}
}
