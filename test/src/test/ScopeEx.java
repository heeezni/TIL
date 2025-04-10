package test;

public class ScopeEx {

	public static void main(String[] args) {
		int a = 10;
		
		if (1==1) { //당연한걸 왜 묻니? 경고
			a = 20;
			int b = 10;
			b = 20;
		} //변수는 선언된 블록 중괄호 안에서만 사용가능

		a = 30;

	} //중괄호로 묶여있는 메인메서드 안에서는 자유롭게 변수 사용가능

}
