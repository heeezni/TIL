package test;

public class LoofEx2 {

	public static void main(String[] args) {

		
//		//for문으로 구구단 만들기
//		for (int i=2; i<10; i++) {
//			System.out.println(i + "단");
//			for (int j=1; j<=9; j++) {
//				//System.out.println(i*j); 이렇게하면 답만 나옴
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println(); //단마다 공백
//		}
		
		//break
		for (int i=0; i<=10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		//continue
		for (int i=0; i<=10; i++) {
			if (i == 6) {
				continue; //출력문 실행되기 전에 continue 조건문 넣기
			}
			System.out.println(i);
			
		
		
		
	}

}
}
