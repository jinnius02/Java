import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class AdjMatrixTest { //인접행렬(VxV)로 그래프구조 저장

	static int [][]adjMatrix;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input1.txt"));
        Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();//정점수
		int C = scan.nextInt();//주어진 입력 간선정보의 수
        
		adjMatrix = new int[N][N];
		
		for(int i=0; i<C; i++) {
			int from = scan.nextInt(); //시작정점
			int to   =scan.nextInt();  //끝정점
			
//			//방향그래프 표현!!
//			adjMatrix[from][to] = 1;
			
			//무방향(양방향)그래프 표현!!
//			adjMatrix[from][to] = 1; 
//			adjMatrix[to][from] = 1; 
			adjMatrix[from][to] = adjMatrix[to][from]=  1; 
			
//			int a,b;
//			a=b=100;
		}
		
		
		print();
		scan.close();
	}//main

	//저장 데이터 확인
	private static void print() {
//		System.out.println(Arrays.toString(adjMatrix));
		//Arrays.toString()는 일차원 배열만 요소 데이터를 문자열로 반환해줌
		
//		for(int i=0; i<adjMatrix.length; i++) {//adjMatrix.length => 행의 갯수 리턴 
//		   System.out.println(Arrays.toString(adjMatrix[i]));
//		}
		
		for(int[] a : adjMatrix) {//adjMatrix.length => 행의 갯수 리턴 
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	

}