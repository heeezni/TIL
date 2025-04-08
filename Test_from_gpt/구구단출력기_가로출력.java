
public class 구구단출력기_가로출력 {

	public static void main(String[] args) {
	        
	        for (int i = 1; i <= 9; i++) { // 바깥쪽 for문 (행)
	            for (int dan = 2; dan <= 9; dan++) { // 안쪽 for문 (열)
                System.out.print(dan + " * " + i + " = " + (dan * i) + "\t"); // \t 탭(tab) 간격을 띄우는 문자 → 가로로 보기 좋게 정렬 
                //println(출력 후 자동으로 줄 바꿈 함) 이 아니라 print (출력 후 줄 바꿈 안 함) 써야함 
	            }
	            System.out.println(); // 줄 바꾸기
	        }
	    }
	}