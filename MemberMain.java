
public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m객체와 m2객체는 같다.");
		} else {
			System.out.println("m객체와 m2객체는 같지않다."); //m과 m2는 "Member()"타입의 변수이지만 독립적 객체임.
		}

	}

}
