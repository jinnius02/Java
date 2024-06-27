import java.util.Scanner;

public class GoodMorning2 {


   static int N,R; //N:입력받을 데이터 수 R:선택할 데이터 수
   static int[] input,res; //input:입력데이터저장    res:결과데이터저장
   static boolean[] visited; //visited: 방문체크용 배열
	
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
  	  N = sc.nextInt();
	  R = sc.nextInt();
	  input = new int[N];
	  res = new int[R];
	
	  for (int i = 0; i < N; i++) {
		input[i] = sc.nextInt();
	  }
//      1. input배열에서 R개의 수를 뽑아서 만들 수 있는 순열을 모두 출력하시오.
      System.out.println("----- 순열 -----");
      makePermutation();
      
//      2. input배열에서 R개의 수를 뽑아서 만들 수 있는 조합을 모두 출력하시오.
      System.out.println("----- 조합 -----");
      makeCombination();
      
      
//      3. input배열로 구성할 수 있는 모든 부분집합을 출력하시오.
      System.out.println("----- 부분집합 -----");
      makeSubset();
      
      sc.close();
   }//main
   
	private static void makeSubset() {
		
	}
	
	private static void makeCombination() {
		
	}
	
	private static void makePermutation() {
		
	}
   
}