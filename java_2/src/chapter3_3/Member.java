package chapter3_3;

public class Member {

		private String name;
		private int number;
		private double score;
		// 동일 클래스 내에서 접근 가능
		// 직접 접근 x getter,setter 메서드 통해 접근 가능
		
		public String getName() {
			return name;
	}
		public void setName(String name) {
			this.name=name;
		}

}
