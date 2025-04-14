
public class ReturnEx {

	public static void main(String[] args) {
		
		// 객체 생성
		Return obj = new Return();
		
		// 메서드 실행(호출)
		obj.getName(); // 출력x: 출력을 위한 메서드가 아닌 문자열을 돌려주는 메서드
	
		String name = obj.getName(); //'홍길동'값 리턴
		System.out.println(name);
		
		int age = obj.getAge();
		System.out.println(age);
		
	}

}
