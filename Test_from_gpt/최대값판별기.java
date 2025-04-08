
public class 최대값판별기 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		if (a < b ) {
		System.out.println(a +"와(과) " + b + " 중에 " + b + "이(가) 더 크다."); //공백도 넣어주기
		} else if (a > b) { //조건문 뒤에 세미클론 쓰지않기
			System.out.println(a +"와(과) " + b + " 중에 " + a + "이(가) 더 크다.");
		} else { //else에는 조건 못 붙임
			System.out.println(a + "와(과) " + b + "는 같다.");
		}

		
		
		
	}

}
