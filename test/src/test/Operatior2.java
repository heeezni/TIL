package test;

public class Operatior2 {

	public static void main(String[] args) {
		
		//비교연산
		int a = 10;
		int b = 5;
		
//		System.out.println(a > b); //True
//		System.out.println(a >= b); //True
//		System.out.println(a < b); // False
//		System.out.println(a <= b); // False
//		System.out.println(a == b); // False
//		System.out.println(a != b); // True
		
		// 문자열 연산
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1==name2); //True
		
		String name3 = new String ("홍길동"); //새로운 String객체를 Heap 메모리에 생성(저장하는 곳이 다르다)
		System.out.println(name1 == name3); //False -> 서로 다른 객체 참조라서
		System.out.println(name1.equals(name3)); //True
		
		//논리연산
		a = 10;
		b = 5;
		System.out.println(a == 10 && a > b); //True -> &&는 왼쪽과 오른쪽 항 둘 다 true 여야  T
		System.out.println(a == 10 || a > b); //True -> ||는 왼쪽과 오른쪽 항 둘 중 하나 이상이 true 여야  T
		System.out.println(!(a == 10)); //False -> ()안의 값이 T이니까, 그 반대인 False 출력

	}

}
