package chapter2_11;

public class Test {
	private static Test instance=new Test();
	//객체 1개만 생성. instance는 '객체 하나라'는 의미의 변수명
	
	private Test() { //생성자는 private 접근제한자 설정
		System.out.println("생성자");
	}
	
	public static Test getInstance() {
		System.out.println("객체리턴");
		return instance; //만든 하나를 돌려줌
	}
	
	
	

}
