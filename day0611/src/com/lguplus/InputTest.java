package com.lguplus;

import java.io.IOException; //ctrl+shift+O -> 자동 import 단축키

public class InputTest {

	public static void main(String[] args) throws IOException { //throws IOException -> 이대로 써주면 됨, 이게 고냥 Rule
		
		System.out.print("한자리 수를 입력하세요: "
				+ "");
//		int su = System.in.read()-48; //아스키코드와 10진수는 48차이
		int su = System.in.read()-'0'; //문자 '0'의 고유값은 48 (-48)
		
			     //'enter'의 아스키코드 값도 존재 => 한 칸 밑으로 내려가고, 처음 시작점으로 이동
				 System.in.read(); //CR 13
				 System.in.read(); //LF 10
		
		System.out.print("동일한 수를 다시 입력하세요: ");
		int su2 = System.in.read(); //문자 '0'의 고유값은 48 (-48)
		System.out.println("입력된 수= "+su); //아스키코드 값 출력.
		System.out.println("그 수의 아스키코드= "+su2); //아스키코드 값 출력.

	}//main
}
