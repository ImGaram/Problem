package gebakke;

import java.util.Scanner;

public class Q1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = 0; j < b; j++) {
                sum = sum*a%10;
            }
            System.out.println(sum==0?10:sum);
        }

        sc.close();
	}
	
}
