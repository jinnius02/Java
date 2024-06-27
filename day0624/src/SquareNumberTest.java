import java.util.Scanner;

public class SquareNumberTest {

	static int callCnt; //몇 번 재귀호출 => 몇 번 연산??
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt(); //X의 N승
		
//		System.out.println(exp1(x, n));
		System.out.println(exp2(x, n));
		
		System.out.println("연산횟수: "+callCnt);
		scan.close();

	}//main
	
	private static int exp1(int x, int n) {
		++callCnt;
		if(n==1) return x;
		
		return x * exp1(x, n-1);
	}//exp1
	
	private static long exp2(int x, int n) {
		++callCnt;
		if(n==1) return x;
		
		long y = exp2(x, n/2);
		
		return (n%2==0)? y*y : y*y*x;
	}//exp2

}//end class
