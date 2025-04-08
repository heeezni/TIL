
public class 학점계산기switch문 {

	public static void main(String[] args) {

		//Switch문으로 만들기
		
		int score = 85 /10 ;
		switch (score) {
		
		case(10) : //100점도 A 포함
		case (9) : 
			System.out.println("A"); break;
		case (8) :
			System.out.println("B"); break;
		case (7) :
			System.out.println("C"); break;
		case (6) :
			System.out.println("D"); break;
			default : 
				System.out.println("F");
	}
		
		
		
		
	}
}
