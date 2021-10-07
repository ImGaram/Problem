package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), n;
		String s;
		Queue<Character> queue = new LinkedList<>();
		
		for (int i = 0; i < num; i++) {	// 1
			n = sc.nextInt();
			s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < n; k++) {
					queue.add(s.charAt(j));
				}
			}
			while (!queue.isEmpty()) {
				System.out.print(queue.poll());
			}
			System.out.println();
		}
	}
}
