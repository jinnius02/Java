package com.ureca;

public class Hongkong implements MenuPan{
	
	public void 짜장면() {
		System.out.println("달콤한 짜장면~~");
	}

	@Override // ctrl+1+enter
	public void 짬뽕() {
        System.out.println("매콤한 짬뽕~~");
        초밥();
	}

	@Override
	public void 볶음밥() {}
	
	public void 초밥() {
		System.out.println("한입에 쏘옥~~");
	}
}
