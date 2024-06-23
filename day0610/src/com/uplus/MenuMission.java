package com.uplus;

import java.util.Scanner;

public class MenuMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int no = 0;
        
        do {
            System.out.println("<<메뉴>>");
            System.out.println("1.검색 2.증가 3.감소 4.종료");
            System.out.print("번호==> ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("#검색결과:" + no);
                    System.out.println();
                    break;
                case 2:
                    no++;
                    System.out.println("#1증가하였습니다.");
                    System.out.println();
                    break;
                case 3:
                    no--;
                    System.out.println("#1감소하였습니다.");
                    System.out.println();
                    break;
                case 4:
                	System.out.println();
                    System.out.println("-- END --");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        } while (true);
	}
}
