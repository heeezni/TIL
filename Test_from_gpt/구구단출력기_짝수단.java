public class 구구단출력기_짝수단 {

    public static void main(String[] args) {
        
        for (int dan = 2; dan < 10; dan++) {
            if (dan % 2 == 0) { // 짝수를 판가름하는 구간
                System.out.println("▶ " + dan + " 단");

                for (int i = 1; i < 10; i++) {
                    System.out.println(dan + " * " + i + " = " + (dan * i));
                }

                System.out.println();
            }
        }
    }
}
