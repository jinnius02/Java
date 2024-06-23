package com.ureca;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
      /*
                입력값 : 
0 1 0 0 1                  
1 3 5                
         ==> 8개의 정수데이터 입력       
       */
      Scanner sc = new Scanner(System.in);
      //sc.nextInt()  sc.nextDouble()   sc.next()  ==> whiteSpace를 구분자로 데이터를 입력
      // 정수입력                  실수입력                      문자열
      
      //sc.nextLine( )  ==> 라인(줄)을 구분자로 데이터를 입력
      //     문자열
      
      int N=8;
      
      String[] arr = new String[N];
      for(int i=0; i<5; i++) {
    	  arr[i] = sc.next();
      }
/*
0 1 0 0 1엔터                  
1 3 5                
==> 최초 sc.next()하면 arr[0]="0"
       다음 sc.next()하면 "공백1공백0"을 만난 다음 
                                    앞의 공백은 제거하고 뒤의 공백전까지를 리턴  arr[1]="1" 
*/    
      
      arr[5] = sc.nextLine();//공백이 5번지에 저장됨
/*
0 1 0 0 1엔터                  
1 3 5                
==> arr[5] = ""

0 1 0 0 1공백공백엔터                  
1 3 5                
==> arr[5] = "공백공백"
*/
      
      int su = Integer.parseInt("100"); //parseInt()는 전달된 문자열의 더블쿼트를 제거하고 난 후에 정수를 리턴
      int su2 = Integer.parseInt("100a"); //NumberFormatException발생 
                                         //==> 인용부호를 제거하고 난후에 숫자가 아닌 경우에 발생하는 예외
      int su3 = Integer.parseInt("100 "); //NumberFormatException발생
      int su4 = Integer.parseInt("");     //NumberFormatException발생
      int su5 = Integer.parseInt("null"); //NumberFormatException발생
      
      
      System.out.println(Arrays.toString(arr));
      
      sc.close();
      
      
      
	}
}