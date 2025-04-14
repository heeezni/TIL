
public class Method {
	
	static void printName() {
		System.out.println("printName() 실행");
	}

	void printEmail() {
		System.out.println("printEmail() 실행");
		
		// 클래스 내에서 다른 메서드 실행(호출)
		printId();
	}
	
	void printId() {
		System.out.println("printId() 실행");
	}
}
