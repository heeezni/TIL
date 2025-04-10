package test;

public class SwitchEx {

	public static void main(String[] args) {

		// switch문 정수값 비교
		int grade = 4;
		
		switch(grade) {
		case 1:
			System.out.println("1등급");
			break;
		case 2:
			System.out.println("2등급");
			break;
		case 3:
			System.out.println("3등급");
			break;
		    default:
			   System.out.println("기타");
		}
		
		// switch 연산식으로
		int score = 82;
		switch (score / 10) {
		case 9: // 90점대
			System.out.println("A+");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
			default: // 59점 이하
			System.out.println("D");
		}
		
		// 문자열 (자바버전 7이상에서만 사용가능)
		String city = "서울";
		switch (city) {
		case "서울":
			System.out.println("서울에 살고있습니다.");
			break;
		case "제주":
			System.out.println("제주에 살고있습니다.");
			break;
			default:
				System.out.println("기타 지역");
		}
		
		// switch문을 if문으로 변환
		//위에 int grade = 4; 라고 써져있음
		if (grade == 1) { //비교연산 사용
			System.out.println("1등급");
		} if (grade == 2) {
			System.out.println("2등급");
		} if (grade == 3) {
			System.out.println("3등급");
		} else {
			System.out.println("기타");
		}
		
		
		
	}

}
