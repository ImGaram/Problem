package practice;

public class Array7 {
	public static void main(String[] args) {
		int[][] score = {
				{10,10,10,10,10},
				{20,20,20,20},
				{30,30,30},
				{40,40},
				{50}
		};
		
		//for (int i = 0; i < score.length; i++) {
		//	for (int j = 0; j < score[i].length; j++) {
				//System.out.print(score[i][j]);
			//}
			//System.out.println();
		//}
		
		for (int[] is : score) {
			for(int j:is) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
