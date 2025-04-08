import java.util.Scanner;

public class 구구단출력기 {

	public static void main(String[] args) {

		//반복문 for문 사용
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		 
        System.out.print("몇 단을 출력할까요? ");
        int dan = sc.nextInt();
		
		//for (int dan = 2; dan<10; dan++) { 입력받은 dan 값으로 해당 단만 출력하려면 for문을 하나만 써야함
			System.out.println("▶ " + dan + " 단");
			
			for (int i = 1; i<10; i++) {
				System.out.println( dan + " * " + i + " = " + (dan*i) );
			}
			System.out.println( ); // 단 사이 한 줄 띄우려면

			 sc.close(); //자원을 닫아주는 안전한 습관
				
	}	
}
