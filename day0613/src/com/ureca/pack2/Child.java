package com.ureca.pack2;

import com.ureca.pack1.Parent;

public class Child extends Parent{
	void callTest() {
//		this.m1(); //부모자식관계이기 때문에 고냥 바로 호출하면 됨. this 생략
		m1(); //m1, m2, m3(protected)는 같은 패키지이기 때문에 에러X.
		m2();
//		m3();
//		m4(); //m4(private)는 같은 클래스가 아니기 때문에 에러 발생.
	}
}
