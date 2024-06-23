package com.ureca.pack2;

import com.ureca.pack1.Parent; //ctrl+1+enter

public class Other {
	void callTest() {
		Parent p = new Parent();
		p.m1();
//		p.m2(); //같은 패키지 아님
//		p.m3(); //같은 패키지 아님
//		p.m4(); //같은 클래스 아님
	}
}
