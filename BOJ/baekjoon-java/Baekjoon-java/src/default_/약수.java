package default_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ¾à¼ö {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb=new StringBuilder();
	static int[] number;
	
	public static void main(String args[]) throws Exception {
		int num=Integer.parseInt(br.readLine());
		String s[]=br.readLine().split(" ");
		number=new int[num];
		for(int i=0;i<num;i++) {
			number[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(number);
		long result=number[0]*number[num-1];
		System.out.println(result);
	}
}
