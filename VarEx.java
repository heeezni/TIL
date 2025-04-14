
public class VarEx {

	public static void main(String[] args) {

		// 클래스변수 사용
		System.out.println(Avante.company);
		
		// 인스턴스변수 사용 -> 인스턴스 변수는 객체 생성 후 사용
		Avante a1 = new Avante(); //'a1' 변수는 'Avante'클래스를 이용해 생성한 객체
		Avante a2 = new Avante();
		a1.color = "화이트";
		a2.color = "블랙";
				
		// 인스턴스변수 출력
		System.out.println("a1 색상 : "+a1.color);
		System.out.println("a2 색상 : "+a2.color);
		
		// 클래스변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);		
		
		// 클래스변수의 값을 변경
		a1.company = "기아"; //a1의 변수 값만 변경했지만, 클래스변수는 모든 객체에서 공유되기 때문에 a2의 값도 바뀜 
		
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);		
		
	}

}
