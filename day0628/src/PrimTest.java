import java.util.Arrays;
import java.util.Scanner;

public class PrimTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //정점수
		int[][]matrix = new int[N][N]; //입력 정보 저장(인접배열) : 저장되는 값은 가중치값
		
		boolean[] visited = new boolean[N]; //사이클 방지
		int[]minEdge = new int[N]; //각 정점에 도달하는 최소 가중치를 저장
		
		//데이터 입력
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				matrix[i][j] = scan.nextInt(); //가중치(비용) 저장
			}
			minEdge[i] = Integer.MAX_VALUE; //minEdge[i]=987654321
		}
		
		Arrays.fill(minEdge, Integer.MAX_VALUE); //2147483647
		
		int minVertex, min, result = 0;
		minEdge[0] = 0; //임의의 시작점 비용 0 셋팅
		
		for(int c=0; c<N; c++) { //모든 정점 수만큼 반복
			min = Integer.MAX_VALUE; //초기값으로 정수의 최대치를 주고 시작
			minVertex = 0;
			
			for(int i=0; i<N; ++i) {
				if(!visited[i] && min > minEdge[i]) {
					min = minEdge[i];
					minVertex = i;
				}
			}//최소비용을 갖는 간선을 찾았다면
			
			System.out.println(Arrays.toString(visited));
			
			result += min; //최소비용을 누적
			visited[minVertex] = true; //최소비용을 갖는 정점 방문 쳌쳌 체크
			
			for(int i=0; i<N; ++i) {
				if(!visited[i] &&
					matrix[minVertex][i] != 0 &&
					minEdge[i] > matrix[minVertex][i]) {
					
					minEdge[i] = matrix[minVertex][i];
					//기존의 최소비용보다 작은 값이 발견되면 최소비용으로 갱신
				}
			}
			
			System.out.println(">>>>" + Arrays.toString(minEdge));
			
		}//for
		System.out.println(result);
		
		scan.close();
	}//main

}//end class
