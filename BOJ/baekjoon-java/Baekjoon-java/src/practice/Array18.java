package practice;

public class Array18 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+5);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
