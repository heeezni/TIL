import java.util.Scanner; //ctrl+shift+o 하면 자동으로 필요한 import 생성

public class 학점계산기if문 {

	public static void main(String[] args) {

		//If문으로 만들기 + scanner 써보기
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
 
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt(); // 사용자로부터 점수 입력 받음
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
			
		sc.close(); // Scanner 닫기 (권장)
		
	}

}
