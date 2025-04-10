package test;

public class LoofEx {

	public static void main(String[] args) {

//		// for문
//		for (int i=0; i<10; i++) {
////			System.out.println(i);
//			System.out.println("안녕하세요");
//		}
		
		// while문
		int number = 0;
		while (number < 10) {
			System.out.println(number);
			number++; //number에 대한 증감식 필요 (무한루프가 돼서)
		}
		
		
		// do while문
		number = 10; //조건 만족하지 않아도 실행문 한 번은 실행
		do {
			System.out.println("실행");
			number++;
		} while (number < 10);
		
		
	}

}
