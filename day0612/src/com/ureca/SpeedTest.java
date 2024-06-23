package com.ureca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SpeedTest {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		Scanner scan = new Scanner(new FileReader("a.txt"));
		String str;
		long start = System.currentTimeMillis();
		
		//Scanner경우
//		while( scan.hasNext()) {
//			str=scan.nextLine();
//			System.out.println(str);
//		}
		
		//BufferedReader경우
		while( (str=br.readLine()) !=null ) {
			System.out.println(str);
		}
		long end = System.currentTimeMillis();
		System.out.println("읽고 쓰는 시간:"+(end-start));
	}

}