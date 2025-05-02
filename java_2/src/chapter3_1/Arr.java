package chapter3_1;

public class Arr { //배열

	public static void main(String[] args) {
		
		int[] arr;
		arr=new int[5];
		System.out.println(arr[0]);
		//출력: 0 (정수자료형으로 초기화해서 기본값 0으로 채워짐)
		
		int[] arr1=new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		int[] arr2= {10,20,30,40,50};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		

	}

}
