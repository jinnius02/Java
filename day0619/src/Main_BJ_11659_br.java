import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_11659_br {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer tokens = new StringTokenizer(str, " ");
//		int T = Integer.parseInt(br.readLine());
//		Scanner sc = new Scanner(System.in);
		
		//수의 개수 N과 합을 구해야 하는 횟수 M 입력 받기
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());
		int[] Arr = new int[N+1]; //N개의 숫자 배열
		int[] Sum = new int[M]; //구간합 배열 저장
		int result = 0; //구간합
		
		// 수 N개 입력
		String str2 = br.readLine();
		StringTokenizer tokens2 = new StringTokenizer(str2, " ");
		for(int i=1; i<=N; i++) {
			Arr[i] = Integer.parseInt(tokens2.nextToken());
		}
		
		//합을 구해야 하는 구간 입력
		for(int i=0; i<M; i++) {
			String str3 = br.readLine();
			StringTokenizer tokens3 = new StringTokenizer(str3, " ");
//			System.out.println("tokens3개수 = "+tokens3.countTokens());
			
			int a = Integer.parseInt(tokens3.nextToken());
			int b = Integer.parseInt(tokens3.nextToken());
			result = 0;
			
			//구간합 구하기
			for(int j=a; j<=b; j++) {
				result += Arr[j];
			}
			System.out.println(result);
			//Sum 배열에 구간합 저장
		}
		
		//구간합 출력(구간합을 저장한 Sum 배열 출력)
//		for(int i=0; i<M; i++) {
//			System.out.println(Sum[i]);
//		}
		br.close();
//		sc.close();
	}//main

}//class
