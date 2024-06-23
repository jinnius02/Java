package com.lguplus;

import java.util.Arrays;

public class MissionArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []su={1,  2,  3,  4,  5};
		
//		System.out.println(su[0]);
//		System.out.println(su[1]);
//		System.out.println(su[2]);
//		System.out.println(su[3]);
//		System.out.println(su[4]);
		
		//배열==객체(필드, 메서드 포함)
		 //자바배열 ==> length속성(필드)
		
//		for(int i=0; i<5; i++)//배열 인덱스 표현
//		for(int i=0; i<su.length; i++)//배열 인덱스 표현
		
		System.out.println("<문제 1>");
		int n=su.length;
		for(int i=0; i<n; i++) { //배열 인덱스 표현
			System.out.println(su[i]);
		}
		
		System.out.println("==============================");
		for(int data:su) //배열 인덱스 표현
			System.out.println(data);
		
		//나는 인덱스에 관심없고 데이터에만 관심이 있다.
		//==> 개선된 for문 (forEach문)을 사용.
		//==> 형식) for(자료형 변수명:배열명) {}
		
		System.out.println("<\n문제 2>");
//		for(int i=4; i>=0; i--) { //번지 인덱스 표현
		for(int i=su.length-1; i>=0; i--) { //번지 인덱스 표현
			System.out.print(su[i]+" ");
		}

		System.out.println("\n<문제 3>");
//		int su2[][]={ {1}, {1,2}, {1,2,3}};
		int su2[][]={ {1}
					  , 
					  {1,2}
					  , 
					  {1,2,3}
					 };
		for(int i=0; i<su2.length; i++) { //행인덱스 (기준)
			for(int j=0; j<su2[i].length; j++) { //열인덱스
				System.out.println("su2["+i+"]["+j+"]번지 = "+su2[i][j]);
			}
		}
		
		System.out.println("\n<문제 4>");
//		int []su3;
//			su3=su; //배열의 주소를 복사(얕은 복사)
//					//동일한 메모리를 su3과 su가 참조!!
//			
//		int []su3= new int[5];
//		int []su3= new int[su.length];
		//깊은 복사(다른 메모리를 할당, 배열 각각의 번지내의 데이터를 복사)
		
//		for(int i=0; i<su2.length; i++) { 
//			su3[i]=su[i];
//		}
		
		//깊은 복사: Object.clone(); ==> Object에는 clone이라는 메소드 존재
		//        System.arraycopy(); ==> 속도가 빠르다!!(API 사용)
		
//		int []su3 = su.clone();
//		int []su3 = System.arraycopy(Object src, 
//				   int srcPos, Object dest, INT destPos, int length);
		
//		System.arraycopy(su, 0, su3, 0, su.length);
		
		int []su3 = Arrays.copyOf(su,  su.length);

//Arrays.copyOfRange(배열original, 시작인덱스from, 복사할 길이to)
//int []su3 = Arrays.copyOfRange(su, 0, su.length);
	//System.arraycopy() 메소드를 편리하게 사용하도록 만든 메소드.
		
		//배열의 값만 (for문을 사용하지 않고)쉽게 출력
		// ==> java.util.Arrays.toString(배열);
		System.out.println("su3배열>>>"+Arrays.toString(su3));
		System.out.println("su3배열>>>"+su3);
		System.out.println("su3배열>>>"+Arrays.toString(su));
		
		System.out.println("#su3배열 데이터출력#");
		for(int data:su) {
			System.out.println(data);
		}
		
		su3[2]=33;
		
		System.out.println("su3[2]번지 데이터출력=>"+ su3[2]);
		System.out.println("su[2]번지 데이터출력=>"+ su[2]);
		
		System.out.println("\n<문제 5>");
		/*
		su={1,2,3,4,5}; ==변경==> su={5,4,3,2,1};
		
		swap작업
		su[0] = su[4];
		su[1] = su[3];
		   i	   j
		
		temp = a;
		   a = b;
		   b = temp;
		*/
		
		int half = su.length/2;
		int temp;
		for(int i=0, j=su.length-1; i<half; i++, j--) {
			temp = su[i];
			su[i] = su[j];
			su[j] = temp;
		}
		
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]+" ");
		}
		
		System.out.println("\n<문제 6>");
		for(int i=0; i<su.length; i++) {
			if(i%2 != 0) System.out.print(su[i]+" ");
		}

		System.out.println("\n<문제 7>");
		for(int i=0; i<su.length; i++) {
			if(su[i]%2 == 1) System.out.print(su[i]+" ");
		}
	}//main
}
