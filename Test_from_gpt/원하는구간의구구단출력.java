import java.util.Scanner; //ctrl+shift+o 하면 자동으로 필요한 import 생성

public class 원하는구간의구구단출력 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
 
        System.out.print("시작 단을 입력하세요 ");
        int start = sc.nextInt(); 
        
        System.out.print("끝 단을 입력하세요 ");
        int end = sc.nextInt(); 
        
        if (start > end) {
        	System.out.println("시작 단은 끝 단보다 작아야 합니다!");
        } else {
        	
        	for (int dan = start; dan <= end; dan++) { //반복에 사용할 변수는 dan이라는 걸 명심
        		
        		System.out.println("▶ " + dan + " 단 ");
        		
        		for (int i = 1; i<10; i++) {
				System.out.println( dan + " * " + i + " = " + (dan*i) );
			}
			System.out.println( ); // 단 사이 한 줄 띄우려면
        }
        
	}
        sc.close();
	}
}