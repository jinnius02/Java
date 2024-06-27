import java.util.Arrays;

public class BinarySearchTest3 {
   public static void main(String[] args) {
	/*
	    Arrays.binarySearch(검색배열, 찾을키값)
	    ==> 이진탐색을 통해 키값이 들아갈 위치(인덱스)를 찾는 기능
	    ==> 단, 배열은 정렬된 상태를 유지
	    ==> 존재하는 데이터가 있다면 데이터 인덱스를 리턴
	    ==> 존재하는 데이터가 없다면  (키값보다 큰 최초위치*-1) -1
	    ==> 내가 원하는 인덱스 값으로 변환 시키려면 |위에서 구한 절대값| -1   하면 됩니다.
	    
	 */
	   int[]arr= {1,2,3,5,6};
	 
	   System.out.println( Arrays.binarySearch(arr, 3));//2
	   System.out.println( Arrays.binarySearch(arr, 4));//-4  ==> 추가할 위치?  |-4| -1  ==> 3
	   
   }
}