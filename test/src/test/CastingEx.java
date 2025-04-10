package test;

public class CastingEx {

	public static void main(String[] args) {
		// 자동형변환
		int a = 10;
		long b = a;
		System.out.println(b); 
		
		//강제형변환 : 강제형변환 시 데이터의 손실이 발생할 수 있음
		double c = 10.5;
		int d = (int) c;
		System.out.println(d);
		
		//연산식
		int e = 10;
		double f = 1.5;
	    double g = e + f; //정수형과 실수형을 더하면 실수형이 나오기 때문
	    System.out.println(g); 

	}

}
