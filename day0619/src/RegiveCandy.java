import java.util.LinkedList;
import java.util.Queue;

public class RegiveCandy {

	public static void main(String[] args) {
//		Queue<int[]> queue = new LinkedList<int[]>();
		Queue<int[]> queue = new LinkedList<>(); //==> 대기열
		
/*
                     데이터
      int su   =  100;
      A   a    =   new A();
      
      int[]su2 = new int[2];
          int[]su2; 
                su2 = new int[2]; // ==> 가능
      		
       =========================== 		
      int[]su2 = {1,1};  ==> 0번지:사람번호,  1번지:받은 캔디수
      
      	int[]su2;
      	     su2={1,1};  ==>에러발생!!  선언과 할당을 따로 작성할 수 없음
       =========================== 		
      	int[]su2;
      	     su2=new int[]{1,1};   ==> 메모리 할당과 함께 정해진 값을 초기화!!  
        	     
      
 */
		int no=1; //줄서기 번호
		
//		첫번째 데이터(사람) 입력
		queue.offer(new int[]{no,1});//==> 0번지:사람번호,  1번지:받을 캔디수
		
		int[] person;
		int candyTotalCnt=20;//전체캔디수
		int availableCnt = 0;//받을 캔디수
		
		while(candyTotalCnt > 0) {
			if(!queue.isEmpty()) { //대기열에 줄 선 사람이 있다며
				//캔디 받기(줄에서 나오기)
                person = queue.poll();
                availableCnt = (candyTotalCnt>=person[1])?  person[1]:candyTotalCnt ;
				candyTotalCnt -= availableCnt; //캔디를 나눠준 만큼 total에서 빼주기
                
				if(candyTotalCnt==0) {//캔디를 전부 나누어 주었을때
					System.out.println("#마지막 캔디를 가져간 사람: "+ person[0] +"번!!");
				}else {//캔디를 나누어 줄수 있을때
					System.out.println(">>["+person[0]+"번]캔디 "+person[1]+"개 가져가요~^^");
					person[1]++; //다음에 받을 캔디수를 증가
                    queue.offer(person);//다시 줄서기
                    queue.offer(new int[] {++no,1});//다음 사람 줄세우기
				}
				
			}
		}//while
		
		

	}//main

}//end class