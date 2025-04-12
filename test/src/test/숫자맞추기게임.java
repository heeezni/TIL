package test;
import java.util.Scanner;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100) +1; // 랜덤 수 구하기
		int count = 0; //입력횟수 저장변수 선언 
		
		while (true) { //userNum은 while루프 내에서 선언 ->(userNum == answer) 안됨. 

				Scanner sc = new Scanner (System.in);
				int userNum = sc.nextInt( );
				count += 1; //값 입력시 1씩 증가 (+=: '='기준 오른쪽 값을 왼쪽에 더하고 대입)
				
				if (userNum > answer) {
					System.out.println("작은 수를 입력하세요."); 
				} else if (userNum < answer) {
				    System.out.println("큰 수를 입력하세요."); 
				} else {	
					System.out.println("정답입니다 . 입력하신 횟수는 " + count + "번 입니다.");
					break;
				} 
					
				}
				
		


	}
}
