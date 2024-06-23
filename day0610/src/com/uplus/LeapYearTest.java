package com.uplus;

import java.util.Scanner; //ctrl+1 ==> 자동으로 import

public class LeapYearTest {

	public static void main(String[] args) {		
//		System.out.println("윤년 테스트!");
		/* <윤년의 조건>
1. 연도를 4로 나누어 나머지가 0이고
   연도를 100 으로 나누어 나머지가 0이 아닌 경우.

2. 연도를 400으로 나누어 나머지가 0인 경우.

    실행결과)
           ==> 조건을 만족했을때 true 출력
           ==> 조건을 만족하지않았을때 false 출력

class명: LeapYearTest
변수: int year = 2022;

<윤년의 조건>

1. 연도를 4로 나누어 나머지가 0이고
연도를 100 으로 나누어 나머지가 0이 아닌 경우.
2. 연도를 400으로 나누어 나머지가 0인 경우.
    
    실행결과)
    ==> 2023년은 평년입니다.
    또는
    ==> 2023년은 윤년입니다.
*/
		
	//java.lang => 기본 패키지
	//java.lang.String		java.lang.System
	//현클래스와 동일한 패키지에 있는 클래스 또는 기본패키지에 있는 클래스는 바로 사용이 가능!!
	//==> 이외의 클래스는 import가 필요: 클랫의 위치를 표현하는 방법!!
	//java.util.Scanner ==> import java.util.Scanner;
		
	Scanner scan = new Scanner(System.in);
	
	int year = scan.nextInt();  //2024
	boolean b1 = (year%4) == 0;
	boolean b2 = (year%100) != 0;
	
	boolean b3 = (year%400) == 0;
	
//	System.out.println((b1 && b2) || b3);
	if((b1 && b2) || b3) {  // == true 이런거 하지 말기
		System.out.println(year+"년은 윤년입니다."); //"2024윤년입니다."
	}else {
		System.out.println(year+"년은 평년입니다.");
	}
	
   }//main
}//class end