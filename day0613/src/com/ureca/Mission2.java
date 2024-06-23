package com.ureca;

import java.util.Arrays;

public class Mission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch= {'J','a','v','A'};
		String []names= {"홍길동","길라임","김주원"};
		
		System.out.println("----Char 배열 오름차순----");
		Arrays.sort(ch);
		for (char i : ch) {
            System.out.print(i + ", ");
        }
		
		System.out.println("\n----String 배열 오름차순----");
		Arrays.sort(names);
		for (String i : names) {
            System.out.print(i + ", ");
        }
		

	}

}
