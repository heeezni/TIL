package chapter3_2;

public class Arr2 {

	public static void main(String[] args) {
		int[][][] arrInt = new int [3][3][3]; // 3차원 배열 (2차원배열이 3개가 있는)
		
		int value = 0;
		// for문 통해 값 대입
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				for (int k=0; k<=2; k++) {
					arrInt[i][j][k] = value ++;
				}
			}
		}
		// 값 출력
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				for (int k=0; k<=2; k++) {
					System.out.print(arrInt[i][j][k]+"\t"); // \t:들여쓰기, 띄어쓰기
				}
				System.out.println();
			}	
		}
	}

}
