import java.util.Arrays;

public class DisjointSetTest {
	
	static int N; //노드 개수
//	static int[] array; //노드의 부모 인덱스 저장
	static int[] parents; //노드의 부모 인덱스 저장
	
	static void make() { //각 집합 생성
		for(int i=0; i<N; i++) {
			parents[i] = i;
			//parents[i]첨자    i 번지 => 각 노드 식별
			//int              i 값   => 부모 인덱스 표현
		}
	}
	static int find(int a) { //대표자 찾기
		if(parents[a] == a) return a; //대표자 찾음!!
		return find(parents[a]); //부모 인덱스의 대표자를 찾아주세요!!
	}
	static boolean union(int a, int b) { //집합 합치기 (대표자 일치시키기)
		                                 //대표자 일치 => return false; (합칠 필요 없음) 
		                                 //대표자 불일치 => return true; (대표자를 일치 시킴)
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot == bRoot) return false;
		
		//==합치기 작업==
		parents[bRoot] = aRoot; //a 그룹의 대표자를 전체(b 그룹의) 대표자로 하겠음.
		
		return true;
	}
	
	public static void main(String[] args) {
		N=5; //0 1 2 3 4 <= 노드
		
		parents = new int[N];
		
		make();
		System.out.println(Arrays.toString(parents));
		
		System.out.println(Arrays.toString(parents));
		System.out.println(union(1,2));
		System.out.println(Arrays.toString(parents));
		System.out.println(union(3,4));
		System.out.println(Arrays.toString(parents));
		System.out.println(union(0,2));
		System.out.println(Arrays.toString(parents));
		System.out.println(union(0,4));
		System.out.println(Arrays.toString(parents));

	}

}
