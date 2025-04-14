
public class Overloading {

	public static void main(String[] args) {
		
		// Operator 객체 생성
		Operator o = new Operator();
		o.add(5, 3);
		o.add(5, 3.0);
		o.add(5.0, 3);
		o.add(5.0, 3.0);

	}

}
