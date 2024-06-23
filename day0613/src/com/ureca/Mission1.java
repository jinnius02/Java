package com.ureca;

public class Mission1 {

	public static void main(String[] args) {
		int []su= {13, 8, 7, 10, 100, 5};
		
		for(int i=0; i<su.length; i++) {
			for(int j=i+1; j<su.length; j++) {
				if(su[i]>su[j]) {
					int temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}
		
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]);
			if(i+1 != su.length) {
				System.out.print(", ");
			}
		}

	}

}
