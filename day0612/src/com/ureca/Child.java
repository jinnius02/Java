package com.ureca;

public class Child extends Parent{
                  //is a  : 자식은 부모다 ==> 자식클래스는 부모클래스로 형변환이 가능하다

   void print() {//오버라이딩 (메소드 재정의)
	   System.out.println("자식");
   }


}