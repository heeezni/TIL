
public class MethodEx {
	
	void one() {
		// two() 호출
		two();
		System.out.println("1");
	}
	
	void two() {
		// three() 호출
		three();
		System.out.println("2");
	}
	
	void three() {
		System.out.println("3");
	}

}
