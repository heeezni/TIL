package test;

public class Operator3 {
	@SuppressWarnings("unused") //경고를 무시하기(SuppressWarnings 어노테이션)
	public static void main(String[] args) {
		
		// 비트논리연산
		// 1은 1, 10은 2, 11은 3
		int num1 = 3; // 11
		int num2 = 3; // 11
		//System.out.println(num1 & num2);
		
		num2 = 2; // 10
		//System.out.println(num1 & num2);
		
		// 비트쉬프트연산
//		System.out.println(3 << 3);
//		System.out.println(Integer.toBinaryString(24)); //2진수 표현을 위한 메서드
//		System.out.println(Integer.toBinaryString(-8)); 
//		System.out.println(-8 >> 3);
//		System.out.println(Integer.toBinaryString(-1));
//		System.out.println(Integer.toBinaryString(-8 >> 3));
		
//		System.out.println(-8 >>> 3); //10진수		
//		System.out.println(Integer.toBinaryString(-8 >>> 3)); //2진수
		
		// 삼항연산
		int score = 80;
		// 점수가 60점 이상이면 합격, 그렇지 않으면 불합격
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		

		
		
		
	}

}
