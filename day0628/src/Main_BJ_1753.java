/* Main1_BJ_1753.java */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_BJ_1753 {//인접행렬 사용으로 인해 메모리 초과

	private static class Vertex implements Comparable<Vertex>{
		int no;
		int totalDistance;
		
		public Vertex(int no, int totalDistance) {
			this.no = no;
			this.totalDistance = totalDistance;
		}
		@Override
		public int compareTo(Vertex o) {
			return this.totalDistance-o.totalDistance;
		}
		@Override
		public String toString() {
			return "Node [vertex=" + no + ", distance=" + totalDistance + "]";
		}
	}	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine().trim());
		int V = Integer.parseInt(st.nextToken()); //정점 갯수
		int E = Integer.parseInt(st.nextToken()); //간선 갯수
		int K = Integer.parseInt(in.readLine());  //시작정점

		
//		int start = 0;
		int end =  V-1; //도착점 인덱스
		final int INFINITY = Integer.MAX_VALUE;
		
		int[][] matrix = new int[V][V];
		int[] distance = new int[V];
		boolean[] visited = new boolean[V];
		
		int u,v,w;//u:기준정점 v:인접된 정점  w:가중치
		for(int i=0; i<V; ++i){
		   Arrays.fill(matrix[i], INFINITY);
		   matrix[i][i]=0;
		}
		
		for(int i=0; i<E; ++i){
			st = new StringTokenizer(in.readLine().trim(), " ");
			u = Integer.parseInt(st.nextToken())-1;
			v = Integer.parseInt(st.nextToken())-1;
			w = Integer.parseInt(st.nextToken());
			matrix[u][v] = w;
		}
		
		
		Arrays.fill(distance, INFINITY);
		distance[K-1] = 0; //시작정점의 거리는 0부터 시작
		
		PriorityQueue<Vertex> pQueue = new PriorityQueue<>();
		pQueue.offer(new Vertex(K-1, distance[K-1]));
		
		
		Vertex current = null;
		
		while(!pQueue.isEmpty()) {
			
			//a단계 : 방문하지 않은 정점들 중 최소가중치의 정점 선택
			current = pQueue.poll();
			if(visited[current.no])continue;
			
			visited[current.no] = true; // 선택 정점 방문 처리
			if(current.no == end) break; // 선택 정점이 도착정점이면 탈출.

			//b단계: current정점을 경유지로 하여 갈수 있는 다른 방문하지 않은 정점들에 대한 처리
			for(int c=0; c<V; ++c){
				if(!visited[c] && matrix[current.no][c] != 0
						&&  matrix[current.no][c] != INFINITY
						&&  distance[c] >current.totalDistance+matrix[current.no][c]){
					distance[c] = current.totalDistance+matrix[current.no][c];
					pQueue.offer(new Vertex(c,distance[c]));
				}
			}
			
		}//while			
		
		for(int i=0; i<V; i++) { //각 정점의 최단거리 출력
		  if(distance[i]==Integer.MAX_VALUE)
			   System.out.println("INF");
		  else
		       System.out.println(distance[i]);
		}
	}

}