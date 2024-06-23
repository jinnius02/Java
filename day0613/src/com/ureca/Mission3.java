package com.ureca;

import java.util.Arrays;
import java.util.Comparator;

public class Mission3 {

	public static void main(String[] args) {
		Person p = new Person("갓길동",11,"학생",95);
		Person[] persons= {p ,
		   	            new Person("빛길동",19,"학생",80),
			            new Person("남길동",14,"학생",100),
			            new Person("여길동",17,"학생",99),
			            new Person("킹길동",15,"학생",56)};
		
		// 이름에 따라 오름차순으로 정렬
        Arrays.sort(persons, Comparator.comparing(Person::getName));

        // 정렬된 배열 출력
        for (Person person : persons) {
            System.out.println(person);
        }
	}
}

class Person {
    private String name;
    private int age;
    private String occupation;
    private int score;

    public Person(String name, int age, String occupation, int score) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.score = score;
    }

    public String getName() {
        return name;
    }

//  @Override: 오버라이딩은 메서드 시그니처가 일치해야 한다. 블록 안의 내용만 재정의 하는 것이다.
    public String toString() {
        return "["+name+", "+age+", "+occupation+", "+score+"]";
    }
}