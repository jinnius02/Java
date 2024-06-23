package com.ureca;

public class Abc {
	
	int su; //== int su=0;
//	My my; //== My my=null;
	String str;
	
	Abc() { //기본 생성자 : 초기화 메서드
		this("ureca"); //다른 생성자 호출 시 첫 번째 문장으로 호출해야 함.
		su=1000;
//		my = new My();
	}
	
	Abc(String str) { //오버로딩 생성자
		this.str=str;
	}
	
	void hello() {
		System.out.println("안녕");
	}
}
