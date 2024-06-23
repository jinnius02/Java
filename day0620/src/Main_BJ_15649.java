import java.util.Scanner;

public class Main_BJ_15649 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Arr = new int[2];
		Arr[0] = sc.nextInt();
		Arr[1] = sc.nextInt();
		
		int N = Arr[0];
		int M = Arr[1];
		
		int[] numbers = new int[M];
		
		for(int i=0; i<M*N; i++) {
			int randomNum = (int) (Math.random()*20);
			for(int j=0; j<M; j++) {
				numbers[j] = randomNum;
			}
		}
		
	sc.close();
	}//main

}//end class
