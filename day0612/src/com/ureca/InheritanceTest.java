package com.ureca;

public class InheritanceTest {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.hello();
		c.hello("홍길동");
		c.print();
		System.out.println(c.su);
		
		c.toString();

	}

}
