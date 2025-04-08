
public class 구구단출력기_거꾸로 { //짝수단만

	public static void main(String[] args) {

		for (int dan = 8; dan >= 2; dan -=2) { //dan -= 2는 자바에서 **dan = dan - 2**를 간단하게 줄여 쓴 복합 대입 연산자
            if (dan % 2 == 0) { // 짝수를 판가름하는 구간
                System.out.println("▶ " + dan + " 단");
                
                for (int i = 1; i < 10; i++) {
                	System.out.println( dan + " * " + i + " = " + (dan*i) );
                }
            System.out.println( );
            }
		}
	}
}