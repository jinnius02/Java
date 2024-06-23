import java.util.Scanner;

public class Main_BJ_11659_구간합구하기4 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();//수의 개수
	    int M = sc.nextInt();//구해야 하는 횟수
	    
	    int[]arr = new int[N+1];
	    
	    //데이터 입력
	    for(int i=1; i<=N; i++) {
//	    	arr[i]=sc.nextInt();
	    	arr[i]=arr[i-1]+sc.nextInt();
	    }
	    
	    //구간합 구하기
	    for(int i=0; i<M; i++) {
	    	int begin = sc.nextInt();
	    	int end   = sc.nextInt();	    	
//	    	int sum =0;
//	    	for(int j=begin; j<=end; j++) {
//	    	      sum+=arr[j];	
//	    	}
//	    	System.out.println(sum);
	    	System.out.println(arr[end]-arr[begin-1]);
	    }
	    
        sc.close();
	}//main

}