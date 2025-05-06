package chapter3_2;

public class Arr {

	public static void main(String[] args) {
		// 첫번째 2차원 배열
		int[][] m = new int[3][3];
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 4;
		m[1][1] = 5;
		m[1][2] = 6;
		m[2][0] = 7;
		m[2][1] = 8;
		m[2][2] = 9;
		
		// 두번째 2차원 배열
		int[][] m2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		// 세번째 2차원 배열 (가독성위해 줄바꿈)
		int[][] m3 = {
				{1,2,3}, // 0번 인덱스
				{4,5,6}, // 1번 인덱스
				{7,8,9}  // 2번 인덱스
		};
		
		System.out.println("[첫번째 2차원 배열]");
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println("[두번째 2차원 배열]");
		for (int i=0; i<m2.length; i++) {
			for (int j=0; j<m2[i].length; j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("[세번째 2차원 배열]");
		for (int i=0; i<m3.length; i++) {
			for (int j=0; j<m3[i].length; j++) {
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
