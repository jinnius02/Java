package com.ureca;

class A{
	public void happy() {
		System.out.println("즐거워~!!");
	}
}//class A

class Child extends A
{//==> 클래스 시작괄호
	@Override
	public void happy() {
	    System.out.println("행복찾기~!!");
	}
}//==> 클래스 끝괄호

interface Ureca{
	void good();
}

class My{
	public static void go(Ureca u) {
		u.good();
	}
}

class UrecaJunior implements Ureca
{//※

	@Override
	public void good() {
		System.out.println("좋아요~!!");
	}
	
}//※※

public class AnonymousInnerClassTest { //익명의 내부클래스 테스트 

	public static void main(String[] args) {
//		My.go(new Ureca());   인터페이스는 객체화 할수 없음!!
		My.go(new UrecaJunior());
		
		//자식클래스 없이 구현객체를 익명의 내부클래스로 정의할 수 있음
		//==> 클래스 파일을 따로 만들지 않아도 되는 잇점을 가졌음.
		My.go(new Ureca() 
		{//※ 의미: 무명 implements Ureca 
			
			@Override
			public void good() {
			   System.out.println("이렇게 좋을수가~^O^ 유레카~~~");	
			}
			
		}//※※
		);		
		
//		A a = new Child();  //new A();
		A a = new Child() {/*내부클래스 영역*/
			public void happy() {
				System.out.println("자꾸 즐거워~~!!");
			}
		};
		  a.happy();

	}

}
