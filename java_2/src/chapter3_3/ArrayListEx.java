package chapter3_3;

import java.util.ArrayList; // ctrl + shift + o

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("홍길동"); //문자열
		al.add(1); //정수
		al.add(95.5); //실수
		
		// 0번 인덱스 출력
		System.out.println(al.get(2));
		
		// 객체 길이 출력
		System.out.println(al.size());
		
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
