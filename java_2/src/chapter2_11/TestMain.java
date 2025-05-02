package chapter2_11;

public class TestMain {

	public static void main(String[] args) {
//		Test t=new Test(); 에러남 private으로 제한해놔서
		Test t=Test.getInstance();
		
		Test t1=Test.getInstance();
		Test t2=Test.getInstance();
		Test t3=Test.getInstance();
	} //생성자는 메모리 로드될 때 딱 한번만 실행

}
