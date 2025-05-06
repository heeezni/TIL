package chapter3_3;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		// Member 객체 생성
		Member m = new Member();
		m.setName("홍길동");
		m.setNumber(1);
		m.setScore(95.5);
		
		ArrayList al = new ArrayList();
		al.add(m);
		// al.get(0).getName(); //형변환!!!
		Member m2 = (Member)al.get(0); //강제 형변환 필요
		// al 객체의 0번 인덱스 위치에 m객체 저장 -> m이 m2에 대입
		
		System.out.println(m2.getName());
		System.out.println(m2.getNumber());
		System.out.println(m2.getScore());
	}

}
