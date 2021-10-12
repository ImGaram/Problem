package practice;

public class Ex12 {
	public static void change(String str) {
		str+="456";
	}
	public static void main(String[] args) {
		//int[] arr;
		//arr = {10,20,30};
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println(str);
	}
}
